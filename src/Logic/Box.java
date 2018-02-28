package Logic;

public class Box {


    private String boxNumber;
    private Point[] point;
    private Line line;

    public Box(String boxNumber, Point[] point, Line line) {
        this.boxNumber = boxNumber;
        this.point = point;
        this.line = line;
    }

    public String getBoxNumber() {
        return boxNumber;
    }

    public Point[] getPoint() {
        return point;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
