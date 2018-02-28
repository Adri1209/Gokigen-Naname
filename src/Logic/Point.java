package Logic;

public class Point {

    private String id;
    private int value;
    private Position position;

    public Point(String id, int value, Position position) {
        this.id = id;
        this.value = value;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public Position getPosition() {
        return position;
    }
}
