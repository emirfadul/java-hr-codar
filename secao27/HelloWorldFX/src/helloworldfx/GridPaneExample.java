package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GridPaneExample extends Application{
    
     @Override
    public void start(Stage primaryStage) throws Exception{

        //criar botao
        Button btn1 = new Button("Botao 1");
        Button btn2 = new Button("Botao 2");
        Button btn3 = new Button("Botao 3");
        Button btn4 = new Button("Botao 4");
        Button btn5 = new Button("Botao 5");
        Button btn6 = new Button("Botao 6");

         //grid pane
         GridPane gridPane = new GridPane();
         gridPane.add(btn1, 1, 1);    
         gridPane.add(btn2, 2, 1);    
         gridPane.add(btn3, 3, 1);    

         gridPane.setHgap(10);

        
        //criando cena com layout
        Scene scene = new Scene(gridPane,300,300);
        
        // configuração do stage
        primaryStage.setTitle("Exemplo stage e scene");
        primaryStage.setScene(scene);
        primaryStage.show();        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
