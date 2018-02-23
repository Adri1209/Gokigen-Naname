import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application implements EventHandler<ActionEvent>{

    Button button;
    Scene scene;

    public static void main(String[] args) {

        launch(args);
    }

    private Parent createContent(){
        Pane root = new Pane();
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

        button = new Button("Start");
        button.setOnAction(this);
        button.setLayoutX(0);
        button.setLayoutY(450);

        root.getChildren().add(button);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Gogiken Naname");

        scene = new Scene(createContent());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Start Gogiken Naname");
            alert.setHeaderText("Gogiken Naname will be started");
            alert.setContentText("This TextBox will be replaced by Algorithm");
            alert.showAndWait();
        }
    }
}
