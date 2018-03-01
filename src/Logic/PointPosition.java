package Logic;

public class PointPosition {

    private Position position;
    private Point point;

    public PointPosition(Position position, Point point) {
        this.position = position;
        this.point = point;
    }

    public Position getPosition() {
        return position;
    }

    public Point getPoint() {
        return point;
    }
}
