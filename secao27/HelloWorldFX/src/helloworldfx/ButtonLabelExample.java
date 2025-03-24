package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonLabelExample extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        //criar label
        Label label = new Label("Este é um label");

        Button button = new Button("clicar");
   
        button.setOnAction(event -> label.setText("Clicou no botao"));
   
        VBox vbox = new VBox();
        vbox.getChildren().addAll(label,button);
     
        
        //criando cena com layout
        Scene scene = new Scene(vbox,300,300);
        
        // configuração do stage
        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
