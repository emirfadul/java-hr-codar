package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class VBoxHBoxExample extends Application {

     @Override
    public void start(Stage primaryStage) throws Exception{

        //criar botao
        Button btn1 = new Button("Botao 1");
        Button btn2 = new Button("Botao 2");
        Button btn3 = new Button("Botao 3");

        VBox vbox = new VBox(15);
        vbox.getChildren().addAll(btn1,btn2,btn3);

        //criar botao
        Button btn4 = new Button("Botao 4");
        Button btn5 = new Button("Botao 5");
        Button btn6 = new Button("Botao 6");

        HBox hbox = new HBox(25);
        hbox.getChildren().addAll(btn4,btn5,btn6);


        VBox root = new VBox(20);
        root.getChildren().addAll(vbox,hbox);

        //criando cela com layout
        Scene scene = new Scene(root,300,300);
        
        // configuração do stage
        primaryStage.setTitle("Exemplo stage e scene");
        primaryStage.setScene(scene);
        primaryStage.show();        
    }


    public static void main(String[] args) {
        launch(args);
    }
    
    
}
