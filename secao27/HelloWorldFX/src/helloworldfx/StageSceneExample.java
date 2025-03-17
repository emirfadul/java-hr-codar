package helloworldfx;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.application.*;
import javafx.stage.*;

public class StageSceneExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        //criar botao
        Button btn = new Button("Clique aqui");

        //criar layout
        StackPane root = new StackPane();
        root.getChildren().add(btn);

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
