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

public class CanvasExample extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{  

        Canvas canvas = new Canvas(400,400);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        //desenhar o canvas




        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(rectangle,circle,ellipse);

        //config do stage
        Scene scene = new Scene(vbox,500,500);
                
        // configuração do stage
        primaryStage.setTitle("Exemplo de Imagem");
        primaryStage.setScene(scene);
        primaryStage.show();        
    } 

    private void dra  


    public static void main(String[] args) {
        launch(args);
    }
}
