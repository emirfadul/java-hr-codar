import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;


public class Calculadora extends Application{

    private Label display = new Label("");
    private String currentInput = "";
    private String operator = "";
    private double previousValue = 0;
    
    @Override
    public void start(Stage primaryStage) throws Exception{        
        
        primaryStage.setTitle("Calculadora simples");

        //layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        //display
        display.setId("display");
        display.setMinSize(200, 50);
        display.setMaxSize(200, 50);
        display.setMaxWidth(Double.MAX_VALUE);
        VBox.setVgrow(display, Priority.NEVER);
        root.getChildren().add(display);

        //Configurar cena
        Scene scene = new Scene(root,300,400);
        scene.getStylesheets().addAll(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}