package helloworldfx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StackPaneAnchorPane extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        //criar botao
        Button btn1 = new Button("Botao 1");
        Button btn2 = new Button("Botao 2");
        Button btn3 = new Button("Botao 3");
        Button btn4 = new Button("Botao 4");
        Button btn5 = new Button("Botao 5");
        Button btn6 = new Button("Botao 6");

        //criar o stackpane
        StackPane stackPane = new StackPane();

        stackPane.getChildren().addAll(btn1);       
        
        //criando cena
        Scene stackScene = new Scene(stackPane,400,400);

        //criar AnchorPane
        AnchorPane anchorPane = new AnchorPane();

        AnchorPane.setTopAnchor(btn3, 10.0);
        AnchorPane.setRightAnchor(btn3, 10.0);

        anchorPane.getChildren().add(btn3);

        //criando cena
        Scene anchorScene = new Scene(anchorPane,500,500);
        
        // configuração do stage
        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(stackScene);
        primaryStage.show();        

        //mudar a cena 2 seg
        new Thread(() -> {
            try {
                
                Thread.sleep(2000);

                Platform.runLater(() -> primaryStage.setScene(anchorScene));
            
            } catch (Exception e) {
                // TODO: handle exception
            }
        }).start();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
