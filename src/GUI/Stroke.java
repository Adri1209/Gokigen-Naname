package GUI;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Stroke extends StackPane {

    public Stroke(double startX, double startY, double endX, double endY){

        Line line = new Line();
        line.setStartX(startX);
        line.setStartY(startY);
        line.setEndX(endX);
        line.setEndY(endY);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(2);

        getChildren().add(line);
    }


}
