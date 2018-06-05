package flix.runtime;

import java.util.Objects;

public final class ReifiedSourceLocation {

    private String source;
    private int beginLine;
    private int beginCol;
    private int endLine;
    private int endCol;

    public ReifiedSourceLocation(String source, int beginLine, int beginCol, int endLine, int endCol) {
        this.source = source;
        this.beginLine = beginLine;
        this.beginCol = beginCol;
        this.endLine = endLine;
        this.endCol = endCol;
    }

    public String getSource() {
        return source;
    }

    public int getBeginLine() {
        return beginLine;
    }

    public int getBeginCol() {
        return beginCol;
    }

    public int getEndLine() {
        return endLine;
    }

    public int getEndCol() {
        return endCol;
    }

    public String format() {
        return source + ":" + beginLine + ":" + beginCol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReifiedSourceLocation source1 = (ReifiedSourceLocation) o;
        return beginLine == source1.beginLine &&
                beginCol == source1.beginCol &&
                endLine == source1.endLine &&
                endCol == source1.endCol &&
                Objects.equals(source, source1.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, beginLine, beginCol, endLine, endCol);
    }

}
