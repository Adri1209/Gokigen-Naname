import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Dot extends StackPane {

    public Dot(String value){

        Circle circle = new Circle(10);
        circle.setFill(null);
        circle.setStroke(Color.BLACK);

        Text text = new Text(value);
        text.setFont(Font.font(20));

        getChildren().addAll(circle,text);

    }


}
