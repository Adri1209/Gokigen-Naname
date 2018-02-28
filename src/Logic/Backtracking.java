package Logic;

import java.util.ArrayList;

import static sun.awt.geom.Crossings.debug;

public class Backtracking {

    private ArrayList<Box> boxes = new ArrayList<>();


    private void fillBoxList() {

        boxes.add(new Box("1", new Point[]{new Point("3", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("2", new Point[]{new Point("3", 2, Position.DOWNLEFT), new Point("4", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("3", new Point[]{new Point("4", 1, Position.DOWNLEFT), new Point("1", 2, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("4", new Point[]{new Point("1", 2, Position.UPLEFT), new Point("5", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("5", new Point[]{new Point("5", 2, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("6", new Point[]{new Point("6", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("7", new Point[]{new Point("6", 1, Position.DOWNRIGHT), new Point("2", 0, Position.UPRIGHT), new Point("7", 4, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("8", new Point[]{new Point("2", 0, Position.UPLEFT), new Point("7", 4, Position.DOWNLEFT)}, Line.EMPTY));

        boxes.add(new Box("9", new Point[]{new Point("8", 0, Position.DOWNLEFT), new Point("3", 2, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("10", new Point[]{new Point("3", 2, Position.UPLEFT), new Point("4", 1, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("11", new Point[]{new Point("4", 1, Position.UPLEFT), new Point("9", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("12", new Point[]{new Point("9", 1, Position.DOWNLEFT), new Point("10", 1, Position.DOWNRIGHT), new Point("5", 2, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("13", new Point[]{new Point("5", 2, Position.UPLEFT), new Point("10", 1, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("14", new Point[]{new Point("6", 1, Position.UPRIGHT), new Point("11", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("15", new Point[]{new Point("6", 1, Position.UPLEFT), new Point("11", 2, Position.DOWNLEFT), new Point("7", 4, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("16", new Point[]{new Point("7", 4, Position.UPLEFT), new Point("12", 1, Position.DOWNRIGHT)}, Line.EMPTY));

        boxes.add(new Box("17", new Point[]{new Point("8", 0, Position.UPLEFT), new Point("13", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("18", new Point[]{new Point("13", 1, Position.DOWNLEFT), new Point("14", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("19", new Point[]{new Point("9", 1, Position.UPRIGHT), new Point("14", 2, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("20", new Point[]{new Point("9", 1, Position.UPLEFT), new Point("10", 1, Position.UPRIGHT), new Point("15", 4, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("21", new Point[]{new Point("10", 1, Position.UPLEFT), new Point("15", 4, Position.DOWNLEFT), new Point("16", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("22", new Point[]{new Point("11", 2, Position.UPRIGHT), new Point("16", 1, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("23", new Point[]{new Point("11", 2, Position.UPLEFT), new Point("17", 3, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("24", new Point[]{new Point("12", 1, Position.UPRIGHT), new Point("17", 3, Position.DOWNLEFT)}, Line.EMPTY));

        boxes.add(new Box("25", new Point[]{new Point("13", 1, Position.UPRIGHT), new Point("18", 2, Position.DOWNLEFT), new Point("19", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("26", new Point[]{new Point("13", 1, Position.UPLEFT), new Point("14", 2, Position.UPRIGHT), new Point("19", 1, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("27", new Point[]{new Point("14", 2, Position.UPLEFT)}, Line.EMPTY));
        boxes.add(new Box("28", new Point[]{new Point("15", 4, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("29", new Point[]{new Point("15", 4, Position.UPLEFT), new Point("16", 1, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("30", new Point[]{new Point("16", 1, Position.UPLEFT)}, Line.EMPTY));
        boxes.add(new Box("31", new Point[]{new Point("17", 3, Position.UPRIGHT), new Point("20", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("32", new Point[]{new Point("17", 3, Position.UPLEFT), new Point("20", 1, Position.DOWNLEFT), new Point("21", 1, Position.DOWNRIGHT)}, Line.EMPTY));

        boxes.add(new Box("33", new Point[]{new Point("18", 2, Position.UPLEFT), new Point("19", 1, Position.UPRIGHT), new Point("22", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("34", new Point[]{new Point("19", 1, Position.UPLEFT), new Point("22", 2, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("35", new Point[]{new Point("23", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("36", new Point[]{new Point("23", 2, Position.DOWNLEFT), new Point("24", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("37", new Point[]{new Point("24", 1, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("38", new Point[]{new Point("25", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("39", new Point[]{new Point("20", 1, Position.UPRIGHT), new Point("25", 2, Position.DOWNLEFT), new Point("26", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("40", new Point[]{new Point("20", 1, Position.UPLEFT), new Point("21", 1, Position.UPRIGHT), new Point("26", 1, Position.DOWNLEFT)}, Line.EMPTY));

        boxes.add(new Box("41", new Point[]{new Point("22", 2, Position.UPRIGHT), new Point("27", 0, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("42", new Point[]{new Point("22", 2, Position.UPLEFT), new Point("28", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("43", new Point[]{new Point("23", 2, Position.UPRIGHT), new Point("28", 2, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("44", new Point[]{new Point("23", 2, Position.UPLEFT), new Point("24", 1, Position.UPRIGHT), new Point("29", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("45", new Point[]{new Point("24", 1, Position.UPLEFT), new Point("29", 2, Position.DOWNLEFT), new Point("30", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("46", new Point[]{new Point("25", 2, Position.UPRIGHT), new Point("30", 2, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("47", new Point[]{new Point("25", 2, Position.UPLEFT), new Point("26", 1, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("48", new Point[]{new Point("26", 1, Position.UPLEFT), new Point("31", 1, Position.DOWNRIGHT)}, Line.EMPTY));

        boxes.add(new Box("49", new Point[]{new Point("27", 0, Position.UPLEFT), new Point("32", 1, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("50", new Point[]{new Point("28", 2, Position.UPRIGHT), new Point("32", 1, Position.DOWNLEFT), new Point("33", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("51", new Point[]{new Point("28", 2, Position.UPLEFT), new Point("33", 2, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("52", new Point[]{new Point("29", 2, Position.UPRIGHT), new Point("34", 3, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("53", new Point[]{new Point("29", 2, Position.UPLEFT), new Point("34", 3, Position.DOWNLEFT), new Point("30", 2, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("54", new Point[]{new Point("30", 2, Position.UPLEFT), new Point("35", 3, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("55", new Point[]{new Point("35", 3, Position.DOWNLEFT), new Point("36", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("56", new Point[]{new Point("36", 2, Position.DOWNLEFT), new Point("31", 1, Position.UPRIGHT)}, Line.EMPTY));

        boxes.add(new Box("57", new Point[]{new Point("32", 1, Position.UPRIGHT), new Point("37", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("58", new Point[]{new Point("32", 1, Position.UPLEFT), new Point("33", 2, Position.UPRIGHT), new Point("37", 2, Position.DOWNLEFT)}, Line.EMPTY));
        boxes.add(new Box("59", new Point[]{new Point("33", 2, Position.UPLEFT)}, Line.EMPTY));
        boxes.add(new Box("60", new Point[]{new Point("34", 3, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("61", new Point[]{new Point("34", 3, Position.UPLEFT), new Point("38", 2, Position.DOWNRIGHT)}, Line.EMPTY));
        boxes.add(new Box("62", new Point[]{new Point("38", 2, Position.DOWNLEFT), new Point("35", 3, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("63", new Point[]{new Point("35", 3, Position.UPLEFT), new Point("36", 2, Position.UPRIGHT)}, Line.EMPTY));
        boxes.add(new Box("64", new Point[]{new Point("36", 2, Position.UPLEFT)}, Line.EMPTY));

    }

    public ArrayList<Box> getBoxesWithLines() {

        fillBoxList();
        return boxes;
    }

    private boolean backtrack(int fieldnumber) {


        for (int i = 1; i < 3; i++) {
            boxes.get(fieldnumber).setLine(getEnumFromNumber(i));
            if (debug)
                System.out.println("    set box value to " + getEnumFromNumber(i).toString() + "in box: " + boxes.get(fieldnumber).getBoxNumber());
            if (checkCriteriums(fieldnumber)) {
                //wenn es möglich wäre so zu laufen, musst du zum nächsten möglichen kästchen laufen.
                // das habe ich nur ausgelagert, weil ich Zeile für zeile ablaufe.
                if (callNextBox(fieldnumber))
                    return true;
                //bevor du true returns, musst du ganz sicher gehen, dass auch das endkriterium erreicht ist
            }
            boxes.get(fieldnumber).setLine(getEnumFromNumber(0));
        }


        return false;
    }

    private boolean callNextBox(int fieldnumber) {
        int maxSize = boxes.size();

        if (fieldnumber < maxSize)
            return backtrack(fieldnumber + 1);

        return true;
    }

    private boolean checkCriteriums(int column) {

        //hier musst du überprüfen, ob das kästchen so gewählt werden kann.
        //zur übersichtlichkeit habe ich das in einzelne methoden gepackt
        //bei dir würde ich es in "lookHorizontal", "lockVertical" auslagern
        if (debug)
            System.out.println("    check criteriums (row:" + " column: " + column + ")");
        if ()
            return false;
        if (debug)
            System.out.println("    uniqueNumberHorizontal: ok");
        if ()
            return false;

        return true;
    }


    private Line getEnumFromNumber(int i) {
        if (i == 0) return Line.EMPTY;
        if (i == 1) return Line.DOWNLEFTTOUPRIGHT;
        if (i == 2) return Line.UPLEFTTODOWNRIGHT;
        return Line.EMPTY;
    }
}
