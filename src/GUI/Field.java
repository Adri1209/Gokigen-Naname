package GUI;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Field extends StackPane {


    public Field(){
        Rectangle rectangle = new Rectangle(50,50);
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);

        getChildren().add(rectangle);
    }

}
