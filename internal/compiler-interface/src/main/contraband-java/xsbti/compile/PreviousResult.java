/**
 * This code is generated using [[https://www.scala-sbt.org/contraband]].
 */

// DO NOT EDIT MANUALLY
package xsbti.compile;
/** The previous source dependency analysis result from compilation. */
public final class PreviousResult implements java.io.Serializable {
    
    public static PreviousResult create(java.util.Optional<xsbti.compile.CompileAnalysis> _analysis, java.util.Optional<xsbti.compile.MiniSetup> _setup) {
        return new PreviousResult(_analysis, _setup);
    }
    public static PreviousResult of(java.util.Optional<xsbti.compile.CompileAnalysis> _analysis, java.util.Optional<xsbti.compile.MiniSetup> _setup) {
        return new PreviousResult(_analysis, _setup);
    }
    public static PreviousResult create(xsbti.compile.CompileAnalysis _analysis, xsbti.compile.MiniSetup _setup) {
        return new PreviousResult(_analysis, _setup);
    }
    public static PreviousResult of(xsbti.compile.CompileAnalysis _analysis, xsbti.compile.MiniSetup _setup) {
        return new PreviousResult(_analysis, _setup);
    }
    private java.util.Optional<xsbti.compile.CompileAnalysis> analysis;
    private java.util.Optional<xsbti.compile.MiniSetup> setup;
    protected PreviousResult(java.util.Optional<xsbti.compile.CompileAnalysis> _analysis, java.util.Optional<xsbti.compile.MiniSetup> _setup) {
        super();
        analysis = _analysis;
        setup = _setup;
    }
    protected PreviousResult(xsbti.compile.CompileAnalysis _analysis, xsbti.compile.MiniSetup _setup) {
        super();
        analysis = java.util.Optional.<xsbti.compile.CompileAnalysis>ofNullable(_analysis);
        setup = java.util.Optional.<xsbti.compile.MiniSetup>ofNullable(_setup);
    }
    
    public java.util.Optional<xsbti.compile.CompileAnalysis> analysis() {
        return this.analysis;
    }
    public java.util.Optional<xsbti.compile.MiniSetup> setup() {
        return this.setup;
    }
    public PreviousResult withAnalysis(java.util.Optional<xsbti.compile.CompileAnalysis> analysis) {
        return new PreviousResult(analysis, setup);
    }
    public PreviousResult withAnalysis(xsbti.compile.CompileAnalysis analysis) {
        return new PreviousResult(java.util.Optional.<xsbti.compile.CompileAnalysis>ofNullable(analysis), setup);
    }
    public PreviousResult withSetup(java.util.Optional<xsbti.compile.MiniSetup> setup) {
        return new PreviousResult(analysis, setup);
    }
    public PreviousResult withSetup(xsbti.compile.MiniSetup setup) {
        return new PreviousResult(analysis, java.util.Optional.<xsbti.compile.MiniSetup>ofNullable(setup));
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof PreviousResult)) {
            return false;
        } else {
            PreviousResult o = (PreviousResult)obj;
            return this.analysis().equals(o.analysis()) && this.setup().equals(o.setup());
        }
    }
    public int hashCode() {
        return 37 * (37 * (37 * (17 + "xsbti.compile.PreviousResult".hashCode()) + analysis().hashCode()) + setup().hashCode());
    }
    public String toString() {
        return "PreviousResult("  + "analysis: " + analysis() + ", " + "setup: " + setup() + ")";
    }
}
