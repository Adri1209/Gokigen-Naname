package Logic;


public class CheckLoop {

    private Box startbox;


    public CheckLoop(Box box) {
        this.startbox = box;
    }

    public boolean checkLoop(Box[][] boxes, int row, int column, boolean start, Box previous) {
        if (!start){
            if (startbox == boxes[row][column]){
                return true;
            }
        }
        if (checkCriteriums(boxes, row, column, previous)) {
            return true;
        }

        return false;
    }

    private boolean checkCriteriums(Box[][] boxes, int row, int column, Box previous) {


        if (boxes[row][column].getLine() == Line.DOWNLEFTTOUPRIGHT){

            try {


                if (boxes[row + 1][column - 1].getLine() == Line.DOWNLEFTTOUPRIGHT && boxes[row + 1][column - 1] != previous ) {
                    return checkLoop(boxes, row + 1, column - 1, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}

            try {

                if (boxes[row - 1][column + 1].getLine() == Line.DOWNLEFTTOUPRIGHT && boxes[row - 1][column + 1] != previous) {
                    return checkLoop(boxes, row - 1, column + 1, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}

            try {
                if (boxes[row][column+1].getLine() == Line.UPLEFTTODOWNRIGHT && boxes[row][column + 1] != previous){
                    return checkLoop(boxes, row, column+1, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}

            try {
                if (boxes[row+1][column].getLine() == Line.UPLEFTTODOWNRIGHT && boxes[row + 1][column] != previous){
                    return checkLoop(boxes, row+1,column,false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}

            try {
                if (boxes[row][column-1].getLine() == Line.UPLEFTTODOWNRIGHT && boxes[row][column - 1] != previous){
                    return checkLoop(boxes, row, column-1, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}

            try {
                if (boxes[row-1][column].getLine() == Line.UPLEFTTODOWNRIGHT && boxes[row - 1][column] != previous){
                    return checkLoop(boxes, row-1,column,false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}
        }
        if (boxes[row][column].getLine() == Line.UPLEFTTODOWNRIGHT){


            try {
                if (boxes[row+1][column+1].getLine() == Line.UPLEFTTODOWNRIGHT && boxes[row + 1][column + 1] != previous){
                    return checkLoop(boxes, row+1, column+1, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}
            try {
                if (boxes[row-1][column-1].getLine() == Line.UPLEFTTODOWNRIGHT && boxes[row - 1][column - 1] != previous){
                    return checkLoop(boxes, row-1, column-1, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}

            try {
                if (boxes[row][column-1].getLine() == Line.DOWNLEFTTOUPRIGHT && boxes[row][column - 1] != previous){
                    return checkLoop(boxes, row, column-1, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}

            try {
                if (boxes[row-1][column].getLine() == Line.DOWNLEFTTOUPRIGHT && boxes[row - 1][column] != previous){
                    return checkLoop(boxes, row-1, column, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}

            try {
                if (boxes[row][column+1].getLine() == Line.DOWNLEFTTOUPRIGHT && boxes[row][column + 1] != previous){
                    return checkLoop(boxes, row, column+1, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}

            try {
                if (boxes[row+1][column].getLine() == Line.DOWNLEFTTOUPRIGHT && boxes[row + 1][column] != previous){
                    return checkLoop(boxes, row+1, column, false, boxes[row][column]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){}
        }
        return false;
    }
}
