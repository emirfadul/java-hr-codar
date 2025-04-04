import javafx.animation.*;
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;


public class Cronometro extends Application{

    private Label timeLabel = new Label("00:00:00");
    private int secondsElapsed = 0;
    private Timeline timeline;
 
    
    @Override
    public void start(Stage primaryStage) throws Exception{        
        
        primaryStage.setTitle("Cronometro");

        //layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        //Display do tempo
        timeLabel.setId("timeLabel");
        root.getChildren().add(timeLabel);

        //layout botoes
        HBox hbox = new HBox();
        hbox.setSpacing(10);

        Button starButton = new Button("Iniciar");
        starButton.setMinSize(100, 50);
        starButton.setId("startButton");

        Button pauseButton = new Button("Pausar");
        pauseButton.setMinSize(100, 50);
        pauseButton.setId("pausetButton");

        Button resetButton = new Button("Reiniciar");
        resetButton.setMinSize(100, 50);
        resetButton.setId("resetButton");

        hbox.getChildren().addAll(starButton,pauseButton,resetButton);

        root.getChildren().addAll(hbox);
       

        //Configurar cena
        Scene scene = new Scene(root,400,200);
        scene.getStylesheets().addAll(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}