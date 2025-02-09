/**
 * This code is generated using [[https://www.scala-sbt.org/contraband]].
 */

// DO NOT EDIT MANUALLY
package xsbti.api;
public final class Def extends xsbti.api.ParameterizedDefinition implements java.io.Serializable {
    
    public static Def create(String _name, Access _access, Modifiers _modifiers, Annotation[] _annotations, TypeParameter[] _typeParameters, ParameterList[] _valueParameters, Type _returnType) {
        return new Def(_name, _access, _modifiers, _annotations, _typeParameters, _valueParameters, _returnType);
    }
    public static Def of(String _name, Access _access, Modifiers _modifiers, Annotation[] _annotations, TypeParameter[] _typeParameters, ParameterList[] _valueParameters, Type _returnType) {
        return new Def(_name, _access, _modifiers, _annotations, _typeParameters, _valueParameters, _returnType);
    }
    private ParameterList[] valueParameters;
    private Type returnType;
    protected Def(String _name, Access _access, Modifiers _modifiers, Annotation[] _annotations, TypeParameter[] _typeParameters, ParameterList[] _valueParameters, Type _returnType) {
        super(_name, _access, _modifiers, _annotations, _typeParameters);
        valueParameters = _valueParameters;
        returnType = _returnType;
    }
    
    public ParameterList[] valueParameters() {
        return this.valueParameters;
    }
    public Type returnType() {
        return this.returnType;
    }
    public Def withName(String name) {
        return new Def(name, access(), modifiers(), annotations(), typeParameters(), valueParameters, returnType);
    }
    public Def withAccess(Access access) {
        return new Def(name(), access, modifiers(), annotations(), typeParameters(), valueParameters, returnType);
    }
    public Def withModifiers(Modifiers modifiers) {
        return new Def(name(), access(), modifiers, annotations(), typeParameters(), valueParameters, returnType);
    }
    public Def withAnnotations(Annotation[] annotations) {
        return new Def(name(), access(), modifiers(), annotations, typeParameters(), valueParameters, returnType);
    }
    public Def withTypeParameters(TypeParameter[] typeParameters) {
        return new Def(name(), access(), modifiers(), annotations(), typeParameters, valueParameters, returnType);
    }
    public Def withValueParameters(ParameterList[] valueParameters) {
        return new Def(name(), access(), modifiers(), annotations(), typeParameters(), valueParameters, returnType);
    }
    public Def withReturnType(Type returnType) {
        return new Def(name(), access(), modifiers(), annotations(), typeParameters(), valueParameters, returnType);
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Def)) {
            return false;
        } else {
            Def o = (Def)obj;
            return this.name().equals(o.name()) && this.access().equals(o.access()) && this.modifiers().equals(o.modifiers()) && java.util.Arrays.deepEquals(this.annotations(), o.annotations()) && java.util.Arrays.deepEquals(this.typeParameters(), o.typeParameters()) && java.util.Arrays.deepEquals(this.valueParameters(), o.valueParameters()) && this.returnType().equals(o.returnType());
        }
    }
    public int hashCode() {
        return 37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (17 + "xsbti.api.Def".hashCode()) + name().hashCode()) + access().hashCode()) + modifiers().hashCode()) + java.util.Arrays.deepHashCode(annotations())) + java.util.Arrays.deepHashCode(typeParameters())) + java.util.Arrays.deepHashCode(valueParameters())) + returnType().hashCode());
    }
    public String toString() {
        return "Def("  + "name: " + name() + ", " + "access: " + access() + ", " + "modifiers: " + modifiers() + ", " + "annotations: " + annotations() + ", " + "typeParameters: " + typeParameters() + ", " + "valueParameters: " + valueParameters() + ", " + "returnType: " + returnType() + ")";
    }
}
