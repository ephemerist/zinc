/*
 * Zinc - The incremental compiler for Scala.
 * Copyright Scala Center, Lightbend, and Mark Harrah
 *
 * Licensed under Apache License 2.0
 * SPDX-License-Identifier: Apache-2.0
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package sbt.inc.consistent

import org.scalatest.funsuite.AnyFunSuite
import sbt.internal.inc.consistent._
import Compat._
import java.io._

class ConsistentAnalysisFormatSuite extends AnyFunSuite {

  def writeTo(out: Serializer): Unit = {
    out.int(0)
    out.int(Int.MinValue)
    out.int(Int.MaxValue)
    out.long(0)
    out.long(Long.MinValue)
    out.long(Long.MaxValue)
    out.byte(0)
    out.byte(Byte.MinValue)
    out.byte(Byte.MaxValue)
    out.bool(false)
    out.bool(true)
    out.string(null)
    out.string("abc")
    out.string("ab\r\n\\c")
    out.writeBlock("block") {
      out.int(42)
      out.int(43)
    }
    out.writeColl("c1", null)(out.int)
    out.writeColl("c2", Nil)(out.int)
    out.writeColl("c3", Seq(1, 2, 3))(out.int)
    out.writeColl("c4", Seq(1, 2, 3), 2) { i => out.int(i); out.int(i * 2) }
    out.end()
  }

  def readFrom(in: Deserializer): Unit = {
    val i1, i2, i3 = in.int()
    assert(i1 == 0)
    assert(i2 == Int.MinValue)
    assert(i3 == Int.MaxValue)
    val l1, l2, l3 = in.long()
    assert(l1 == 0)
    assert(l2 == Long.MinValue)
    assert(l3 == Long.MaxValue)
    val b1, b2, b3 = in.byte()
    assert(b1 == 0)
    assert(b2 == Byte.MinValue)
    assert(b3 == Byte.MaxValue)
    val p1, p2 = in.bool()
    assert(p1 == false)
    assert(p2 == true)
    val s1, s2, s3 = in.string()
    assert(s1 == null)
    assert(s2 == "abc")
    assert(s3 == "ab\r\n\\c")
    val (i4, i5) = in.readBlock((in.int(), in.int()))
    assert(i4 == 42)
    assert(i5 == 43)
    val c1, c2, c3 = in.readColl[Int, Seq[Int]](Seq)(in.int())
    val c4 = in.readColl[(Int, Int), Seq[(Int, Int)]](Seq, 2)((in.int(), in.int()))
    assert(c1 == null)
    assert(c2.isEmpty)
    assert(c3 == Seq(1, 2, 3))
    assert(c4 == Seq((1, 2), (2, 4), (3, 6)))
    ()
  }

  test("TextSerializer") {
    val out = new StringWriter()
    writeTo(new TextSerializer(out))
    readFrom(new TextDeserializer(new BufferedReader(new StringReader(out.toString))))
  }

  test("BinarySerializer") {
    val out = new ByteArrayOutputStream()
    writeTo(SerializerFactory.binary.serializerFor(out))
    readFrom(SerializerFactory.binary.deserializerFor(new ByteArrayInputStream(out.toByteArray)))
  }
}
