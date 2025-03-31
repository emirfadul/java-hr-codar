package helloworldfx;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;

public class SmoothAnimation extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{  

       

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(canvas);

        //config do stage
        Scene scene = new Scene(vbox,500,500);
                
        // configuração do stage
        primaryStage.setTitle("Exemplo de Imagem");
        primaryStage.setScene(scene);
        primaryStage.show();        
    } 

    public static void main(String[] args) {
        launch(args);
    }
}
