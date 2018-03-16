package Logic;

public class Box {

    private PointPosition[] pointPositions;
    private Line line;

    public Box(PointPosition[] pointPositions) {
        this.pointPositions = pointPositions;
        this.line = Line.EMPTY;
    }

    public PointPosition[] getPointPositions() {
        return pointPositions;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
