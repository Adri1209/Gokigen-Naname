package GUI;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Dot extends StackPane {

    Circle circle;

    public Dot(String value){

        circle = new Circle(12.5);
        circle.setFill(Color.BLACK);
        circle.setStroke(Color.WHITE);

        Text text = new Text(value);
        text.setFont(Font.font(20));
        text.setFill(Color.WHITE);

        getChildren().addAll(circle,text);

    }

    public double getRadius(){
        return circle.getRadius();
    }


}
