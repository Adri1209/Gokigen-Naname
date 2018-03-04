package Logic;

import java.util.ArrayList;

import static sun.awt.geom.Crossings.debug;

public class Backtracking {

    private Box[][] boxes;
    private ArrayList<Point> points;

    public Backtracking() {
        boxes = new Box[8][8];
        points = new ArrayList<>();
    }


    private void createPoints() {
        points.add(new Point(2));
        points.add(new Point(0));
        points.add(new Point(2));
        points.add(new Point(1));
        points.add(new Point(2));
        points.add(new Point(1));
        points.add(new Point(4));
        points.add(new Point(0));
        points.add(new Point(1));
        points.add(new Point(1));
        points.add(new Point(2));
        points.add(new Point(1));
        points.add(new Point(1));
        points.add(new Point(2));
        points.add(new Point(4));
        points.add(new Point(1));
        points.add(new Point(3));
        points.add(new Point(2));
        points.add(new Point(1));
        points.add(new Point(1));
        points.add(new Point(1));
        points.add(new Point(2));
        points.add(new Point(2));
        points.add(new Point(1));
        points.add(new Point(2));
        points.add(new Point(1));
        points.add(new Point(0));
        points.add(new Point(2));
        points.add(new Point(2));
        points.add(new Point(2));
        points.add(new Point(1));
        points.add(new Point(1));
        points.add(new Point(2));
        points.add(new Point(3));
        points.add(new Point(3));
        points.add(new Point(2));
        points.add(new Point(2));
        points.add(new Point(2));
    }


    private void fillBoxList() {

        createPoints();

        boxes[0][0] = new Box(new PointPosition[]{new PointPosition(Position.DOWNRIGHT, points.get(2))}, Line.EMPTY);
        boxes[0][1] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(2)), new PointPosition(Position.DOWNRIGHT, points.get(3))}, Line.EMPTY);
        boxes[0][2] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(3)), new PointPosition(Position.UPRIGHT, points.get(0))}, Line.EMPTY);
        boxes[0][3] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(1)), new PointPosition(Position.DOWNRIGHT, points.get(4))}, Line.EMPTY);
        boxes[0][4] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(4))}, Line.EMPTY);
        boxes[0][5] = new Box(new PointPosition[]{new PointPosition(Position.DOWNRIGHT, points.get(5))}, Line.EMPTY);
        boxes[0][6] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(5)), new PointPosition(Position.UPRIGHT, points.get(1)), new PointPosition(Position.DOWNRIGHT, points.get(6))}, Line.EMPTY);
        boxes[0][7] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(7)), new PointPosition(Position.DOWNLEFT, points.get(6))}, Line.EMPTY);

        boxes[1][0] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(7)), new PointPosition(Position.UPRIGHT, points.get(2))}, Line.EMPTY);
        boxes[1][1] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(2)), new PointPosition(Position.UPRIGHT, points.get(3))}, Line.EMPTY);
        boxes[1][2] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(3)), new PointPosition(Position.DOWNRIGHT, points.get(8))}, Line.EMPTY);
        boxes[1][3] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(8)), new PointPosition(Position.DOWNRIGHT, points.get(9)), new PointPosition(Position.UPRIGHT, points.get(4))}, Line.EMPTY);
        boxes[1][4] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(4)), new PointPosition(Position.DOWNLEFT, points.get(9))}, Line.EMPTY);
        boxes[1][5] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(5)), new PointPosition(Position.DOWNRIGHT, points.get(10))}, Line.EMPTY);
        boxes[1][6] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(5)), new PointPosition(Position.DOWNLEFT, points.get(10)), new PointPosition(Position.UPRIGHT, points.get(6))}, Line.EMPTY);
        boxes[1][7] = new Box(new PointPosition[]{new PointPosition(Position.DOWNRIGHT, points.get(11)), new PointPosition(Position.UPLEFT, points.get(6))}, Line.EMPTY);

        boxes[2][0] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(7)), new PointPosition(Position.DOWNRIGHT, points.get(12))}, Line.EMPTY);
        boxes[2][1] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(12)), new PointPosition(Position.DOWNRIGHT, points.get(13))}, Line.EMPTY);
        boxes[2][2] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(8)), new PointPosition(Position.DOWNLEFT, points.get(13))}, Line.EMPTY);
        boxes[2][3] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(8)), new PointPosition(Position.UPRIGHT, points.get(9)), new PointPosition(Position.DOWNRIGHT, points.get(14))}, Line.EMPTY);
        boxes[2][4] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(9)), new PointPosition(Position.DOWNLEFT, points.get(14)), new PointPosition(Position.DOWNRIGHT, points.get(15))}, Line.EMPTY);
        boxes[2][5] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(10)), new PointPosition(Position.DOWNLEFT, points.get(15))}, Line.EMPTY);
        boxes[2][6] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(10)), new PointPosition(Position.DOWNRIGHT, points.get(16))}, Line.EMPTY);
        boxes[2][7] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(11)), new PointPosition(Position.DOWNLEFT, points.get(16))}, Line.EMPTY);

        boxes[3][0] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(12)), new PointPosition(Position.DOWNLEFT, points.get(17)), new PointPosition(Position.DOWNRIGHT, points.get(18))}, Line.EMPTY);
        boxes[3][1] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(12)), new PointPosition(Position.UPRIGHT, points.get(13)), new PointPosition(Position.DOWNLEFT, points.get(18))}, Line.EMPTY);
        boxes[3][2] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(13))}, Line.EMPTY);
        boxes[3][3] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(14))}, Line.EMPTY);
        boxes[3][4] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(14)), new PointPosition(Position.UPRIGHT, points.get(15))}, Line.EMPTY);
        boxes[3][5] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(15))}, Line.EMPTY);
        boxes[3][6] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(16)), new PointPosition(Position.DOWNRIGHT, points.get(19))}, Line.EMPTY);
        boxes[3][7] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(16)), new PointPosition(Position.DOWNLEFT, points.get(19)), new PointPosition(Position.DOWNRIGHT, points.get(20))}, Line.EMPTY);

        boxes[4][0] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(17)), new PointPosition(Position.UPRIGHT, points.get(18)), new PointPosition(Position.DOWNRIGHT, points.get(21))}, Line.EMPTY);
        boxes[4][1] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(18)), new PointPosition(Position.DOWNLEFT, points.get(21))}, Line.EMPTY);
        boxes[4][2] = new Box(new PointPosition[]{new PointPosition(Position.DOWNRIGHT, points.get(22))}, Line.EMPTY);
        boxes[4][3] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(22)), new PointPosition(Position.DOWNRIGHT, points.get(23))}, Line.EMPTY);
        boxes[4][4] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(23))}, Line.EMPTY);
        boxes[4][5] = new Box(new PointPosition[]{new PointPosition(Position.DOWNRIGHT, points.get(24))}, Line.EMPTY);
        boxes[4][6] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(19)), new PointPosition(Position.DOWNLEFT, points.get(24)), new PointPosition(Position.DOWNRIGHT, points.get(25))}, Line.EMPTY);
        boxes[4][7] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(19)), new PointPosition(Position.UPRIGHT, points.get(20)), new PointPosition(Position.DOWNLEFT, points.get(25))}, Line.EMPTY);

        boxes[5][0] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(21)), new PointPosition(Position.DOWNLEFT, points.get(26))}, Line.EMPTY);
        boxes[5][1] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(21)), new PointPosition(Position.DOWNRIGHT, points.get(27))}, Line.EMPTY);
        boxes[5][2] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(22)), new PointPosition(Position.DOWNLEFT, points.get(27))}, Line.EMPTY);
        boxes[5][3] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(22)), new PointPosition(Position.UPRIGHT, points.get(23)), new PointPosition(Position.DOWNRIGHT, points.get(28))}, Line.EMPTY);
        boxes[5][4] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(23)), new PointPosition(Position.DOWNLEFT, points.get(28)), new PointPosition(Position.DOWNRIGHT, points.get(29))}, Line.EMPTY);
        boxes[5][5] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(24)), new PointPosition(Position.DOWNLEFT, points.get(29))}, Line.EMPTY);
        boxes[5][6] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(24)), new PointPosition(Position.UPRIGHT, points.get(25))}, Line.EMPTY);
        boxes[5][7] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(25)), new PointPosition(Position.DOWNRIGHT, points.get(30))}, Line.EMPTY);

        boxes[6][0] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(26)), new PointPosition(Position.DOWNRIGHT, points.get(31))}, Line.EMPTY);
        boxes[6][1] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(27)), new PointPosition(Position.DOWNLEFT, points.get(31))}, Line.EMPTY);
        boxes[6][2] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(27)), new PointPosition(Position.DOWNLEFT, points.get(32))}, Line.EMPTY);
        boxes[6][3] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(28)), new PointPosition(Position.DOWNRIGHT, points.get(33))}, Line.EMPTY);
        boxes[6][4] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(28)), new PointPosition(Position.DOWNLEFT, points.get(33)), new PointPosition(Position.UPRIGHT, points.get(29))}, Line.EMPTY);
        boxes[6][5] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(29)), new PointPosition(Position.DOWNRIGHT, points.get(34))}, Line.EMPTY);
        boxes[6][6] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(34)), new PointPosition(Position.DOWNRIGHT, points.get(35))}, Line.EMPTY);
        boxes[6][7] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(35)), new PointPosition(Position.UPRIGHT, points.get(30))}, Line.EMPTY);

        boxes[7][0] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(31)), new PointPosition(Position.DOWNRIGHT, points.get(36))}, Line.EMPTY);
        boxes[7][1] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(31)), new PointPosition(Position.UPRIGHT, points.get(32)), new PointPosition(Position.DOWNLEFT, points.get(36))}, Line.EMPTY);
        boxes[7][2] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(32))}, Line.EMPTY);
        boxes[7][3] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT, points.get(33))}, Line.EMPTY);
        boxes[7][4] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(33)), new PointPosition(Position.DOWNRIGHT, points.get(37))}, Line.EMPTY);
        boxes[7][5] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT, points.get(37)), new PointPosition(Position.UPRIGHT, points.get(34))}, Line.EMPTY);
        boxes[7][6] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(34)), new PointPosition(Position.UPRIGHT, points.get(35))}, Line.EMPTY);
        boxes[7][7] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT, points.get(35))}, Line.EMPTY);
    }

    public Box[][] getBoxesWithLines() {

        fillBoxList();
        System.out.println("Backtracking starts");
        long start = System.currentTimeMillis();
        backtrack(0, 0);
        System.out.println("Finished Backtracking after " + (System.currentTimeMillis() - start) + " ms");
        return boxes;
    }

    private boolean backtrack(int row, int column) {


        for (int i = 1; i < 3; i++) {
            boxes[row][column].setLine(getEnumFromNumber(i));
            if (debug)
                System.out.println("    set box value to " + getEnumFromNumber(i).toString() + "in box: " + column + " in row " + row);
            if (checkCriteriums(row, column)) {
                if (callNextBox(row, column))
                    return true;
                else {
                    resetPointValues(row,column);
                }
            }
            boxes[row][column].setLine(getEnumFromNumber(0));
        }


        return false;
    }

    private void resetPointValues(int row, int column){
        Box actualBox = boxes[row][column];
        Line line = actualBox.getLine();
        PointPosition[] pointPositions = actualBox.getPointPositions();

        if (line == Line.DOWNLEFTTOUPRIGHT) {

            for (int i = 0; i < pointPositions.length; i++) {
                if (pointPositions[i].getPosition() == Position.DOWNLEFT) {
                    pointPositions[i].getPoint().setValue(pointPositions[i].getPoint().getValue() + 1);
                }
                if (pointPositions[i].getPosition() == Position.UPRIGHT) {
                    pointPositions[i].getPoint().setValue(pointPositions[i].getPoint().getValue() + 1);
                }
            }
        }
        if (line == Line.UPLEFTTODOWNRIGHT) {
            for (int i = 0; i < pointPositions.length; i++) {
                if (pointPositions[i].getPosition() == Position.UPLEFT) {
                    pointPositions[i].getPoint().setValue(pointPositions[i].getPoint().getValue() + 1);
                }
                if (pointPositions[i].getPosition() == Position.DOWNRIGHT) {
                    pointPositions[i].getPoint().setValue(pointPositions[i].getPoint().getValue() + 1);
                }
            }
        }
    }

    private boolean callNextBox(int row, int column) {
        int maxSize = boxes.length;

        if (row < maxSize - 1 && column < maxSize - 1)
            return backtrack(row, column + 1);

        //if we are on the end of one row
        if (row < maxSize - 1 && column == maxSize - 1)
            return backtrack(row + 1, 0);

        if (row == maxSize - 1 && column < maxSize - 1)
            return backtrack(row, column + 1);

        return true;
    }

    private boolean checkCriteriums(int row, int column) {

        if (debug)
            System.out.println("    check criteriums (row: " + row + " column: " + column + ")");
        if (!FieldHasNoCircle(row, column))
            return false;
        if (!PointIsComplete(row, column))
            return false;

        //TODO Regeln aufstellen

        return true;
    }

    private boolean PointIsComplete(int row, int column) {

        Box actualBox = boxes[row][column];
        Line line = actualBox.getLine();
        PointPosition[] pointPositions = actualBox.getPointPositions();

        if (line == Line.DOWNLEFTTOUPRIGHT) {

            Point pointDownLeft = null;
            Point pointUpRight = null;

            for (int i = 0; i < pointPositions.length; i++) {
                if (pointPositions[i].getPosition() == Position.DOWNLEFT) {
                    if (pointPositions[i].getPoint().getValue() == 0) return false;
                    pointDownLeft = pointPositions[i].getPoint();
                }
                if (pointPositions[i].getPosition() == Position.UPRIGHT) {
                    if (pointPositions[i].getPoint().getValue() == 0) return false;
                    pointUpRight = pointPositions[i].getPoint();
                }

            }

            if (pointDownLeft != null){
                pointDownLeft.setValue(pointDownLeft.getValue()-1);
            }
            if (pointUpRight != null){
                pointUpRight.setValue(pointUpRight.getValue() - 1);
            }
        }
        if (line == Line.UPLEFTTODOWNRIGHT) {

            Point pointUpLeft = null;
            Point pointDownRight = null;


            for (int i = 0; i < pointPositions.length; i++) {
                if (pointPositions[i].getPosition() == Position.UPLEFT) {
                    if (pointPositions[i].getPoint().getValue() == 0) return false;
                    pointUpLeft = pointPositions[i].getPoint();
                }
                if (pointPositions[i].getPosition() == Position.DOWNRIGHT) {
                    if (pointPositions[i].getPoint().getValue() == 0) return false;
                    pointDownRight = pointPositions[i].getPoint();
                }
            }

            if (pointUpLeft != null){
                pointUpLeft.setValue(pointUpLeft.getValue() - 1);
            }
            if (pointDownRight != null){
                pointDownRight.setValue(pointDownRight.getValue() - 1);
            }
        }

        return true;
    }

    private boolean FieldHasNoCircle(int row, int column) {

        return true;
    }


    private Line getEnumFromNumber(int i) {
        if (i == 0) return Line.EMPTY;
        if (i == 1) return Line.DOWNLEFTTOUPRIGHT;
        if (i == 2) return Line.UPLEFTTODOWNRIGHT;
        return Line.EMPTY;
    }
}
