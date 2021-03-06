import GUI.Dot;
import GUI.Field;
import GUI.Stroke;
import Logic.Backtracking;
import Logic.Box;
import Logic.Line;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application implements EventHandler<ActionEvent>{

    Button button;
    Scene scene;
    Pane root;

    public static void main(String[] args) {

        launch(args);
    }

    private Parent createContent(){
        root = new Pane();
        root.setPrefSize(500,500);

        List<Field> fields = new ArrayList<>();
        for (int i = 0; i<64; i++){
            fields.add(new Field());
        }

        for (int i = 0; i< fields.size(); i++){
            Field field = fields.get(i);
            field.setTranslateX((50 * (i % 8))+50);
            field.setTranslateY((50 * (i / 8))+50);
            root.getChildren().add(field);
        }

        setCircles(root);

        button = new Button("Start");
        button.setOnAction(this);
        button.setLayoutX(50);
        button.setLayoutY(475);

        root.getChildren().add(button);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Gogiken Naname");

        scene = new Scene(createContent());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {

        Backtracking backtracking = new Backtracking();
        Box [][] boxes = backtracking.getBoxesWithLines();
        double xPosition = 50;
        double yPosition = 50;

        for (int i = 0; i< boxes.length; i++){
            for (int j = 0; j<boxes[i].length; j++){
                if (boxes[i][j].getLine() == Line.DOWNLEFTTOUPRIGHT){
                    Stroke stroke = new Stroke(xPosition+50,yPosition,xPosition, yPosition+50);
                    stroke.setTranslateX(xPosition);
                    stroke.setTranslateY(yPosition);
                    root.getChildren().add(stroke);
                }
                if (boxes[i][j].getLine() == Line.UPLEFTTODOWNRIGHT){
                    Stroke stroke = new Stroke(xPosition,yPosition,xPosition+50, yPosition+50);
                    stroke.setTranslateX(xPosition);
                    stroke.setTranslateY(yPosition);
                    root.getChildren().add(stroke);
                }
                xPosition += 50;
            }

            xPosition = 50;
            yPosition += 50;
        }
    }

    private void setCircles (Pane root){

        Dot dot;

        dot = new Dot("0");
        dot.setTranslateX(400-dot.getRadius());
        dot.setTranslateY(50-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(200-dot.getRadius());
        dot.setTranslateY(50-dot.getRadius());
        root.getChildren().add(dot);

        dot = new Dot("4");
        dot.setTranslateX(400-dot.getRadius());
        dot.setTranslateY(100-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(350-dot.getRadius());
        dot.setTranslateY(100-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(250-dot.getRadius());
        dot.setTranslateY(100-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(150-dot.getRadius());
        dot.setTranslateY(100-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(100-dot.getRadius());
        dot.setTranslateY(100-dot.getRadius());
        root.getChildren().add(dot);

        dot = new Dot("1");
        dot.setTranslateX(450-dot.getRadius());
        dot.setTranslateY(150-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(350-dot.getRadius());
        dot.setTranslateY(150-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(250-dot.getRadius());
        dot.setTranslateY(150-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(200-dot.getRadius());
        dot.setTranslateY(150-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("0");
        dot.setTranslateX(50-dot.getRadius());
        dot.setTranslateY(150-dot.getRadius());
        root.getChildren().add(dot);

        dot = new Dot("3");
        dot.setTranslateX(400-dot.getRadius());
        dot.setTranslateY(200-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(300-dot.getRadius());
        dot.setTranslateY(200-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("4");
        dot.setTranslateX(250-dot.getRadius());
        dot.setTranslateY(200-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(150-dot.getRadius());
        dot.setTranslateY(200-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(100-dot.getRadius());
        dot.setTranslateY(200-dot.getRadius());
        root.getChildren().add(dot);

        dot = new Dot("1");
        dot.setTranslateX(450-dot.getRadius());
        dot.setTranslateY(250-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(400-dot.getRadius());
        dot.setTranslateY(250-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(100-dot.getRadius());
        dot.setTranslateY(250-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(50-dot.getRadius());
        dot.setTranslateY(250-dot.getRadius());
        root.getChildren().add(dot);

        dot = new Dot("1");
        dot.setTranslateX(400-dot.getRadius());
        dot.setTranslateY(300-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(350-dot.getRadius());
        dot.setTranslateY(300-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(250-dot.getRadius());
        dot.setTranslateY(300-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(200-dot.getRadius());
        dot.setTranslateY(300-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(100-dot.getRadius());
        dot.setTranslateY(300-dot.getRadius());
        root.getChildren().add(dot);

        dot = new Dot("1");
        dot.setTranslateX(450-dot.getRadius());
        dot.setTranslateY(350-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(300-dot.getRadius());
        dot.setTranslateY(350-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(250-dot.getRadius());
        dot.setTranslateY(350-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(150-dot.getRadius());
        dot.setTranslateY(350-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("0");
        dot.setTranslateX(50-dot.getRadius());
        dot.setTranslateY(350-dot.getRadius());
        root.getChildren().add(dot);

        dot = new Dot("2");
        dot.setTranslateX(400-dot.getRadius());
        dot.setTranslateY(400-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("3");
        dot.setTranslateX(350-dot.getRadius());
        dot.setTranslateY(400-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("3");
        dot.setTranslateX(250-dot.getRadius());
        dot.setTranslateY(400-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(150-dot.getRadius());
        dot.setTranslateY(400-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("1");
        dot.setTranslateX(100-dot.getRadius());
        dot.setTranslateY(400-dot.getRadius());
        root.getChildren().add(dot);

        dot = new Dot("2");
        dot.setTranslateX(300-dot.getRadius());
        dot.setTranslateY(450-dot.getRadius());
        root.getChildren().add(dot);
        dot = new Dot("2");
        dot.setTranslateX(100-dot.getRadius());
        dot.setTranslateY(450-dot.getRadius());
        root.getChildren().add(dot);
    }
}
