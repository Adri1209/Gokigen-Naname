package Logic;

public class Box {

    private PointPosition[] pointPositions;
    private Line line;

    public Box(PointPosition[] pointPositions, Line line) {
        this.pointPositions = pointPositions;
        this.line = line;
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
