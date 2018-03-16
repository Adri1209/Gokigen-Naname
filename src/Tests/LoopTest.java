package Tests;

import Logic.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopTest {

    private Box [][] boxes;

    @Before
    public void init(){

    }

    @Test
    public void testIfLoop(){
        boxes = new Box[2][2];
        boxes[0][0] = new Box(new PointPosition[]{new PointPosition(Position.DOWNLEFT,new Point(4))});
        boxes[0][0].setLine(Line.DOWNLEFTTOUPRIGHT);
        boxes[0][1] = new Box(new PointPosition[]{new PointPosition(Position.DOWNRIGHT,new Point(3))});
        boxes[0][1].setLine(Line.UPLEFTTODOWNRIGHT);
        boxes[1][0] = new Box(new PointPosition[]{new PointPosition(Position.UPLEFT,new Point(2))});
        boxes[1][0].setLine(Line.UPLEFTTODOWNRIGHT);
        boxes[1][1] = new Box(new PointPosition[]{new PointPosition(Position.UPRIGHT,new Point(1))});
        boxes[1][1].setLine(Line.DOWNLEFTTOUPRIGHT);
        CheckLoop checkLoop = new CheckLoop(boxes[0][0]);
        assertEquals(true, checkLoop.checkLoop(boxes,0,0,true, null));
    }
}
