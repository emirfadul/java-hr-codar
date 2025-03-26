package helloworldfx;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;

public class ShapeDrawingExample extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{  

        //retangulo
        Rectangle rectangle = new Rectangle(200,100);

        rectangle.setFill(Color.CHOCOLATE);
        rectangle.setStroke(Color.AQUA);
        rectangle.setStrokeWidth(4);

        //circle
        Circle circle = new Circle(50);

        circle.setFill(Color.SALMON);
        circle.setStroke(Color.GOLD);
        circle.setStrokeWidth(10);

        //Elipse
        Ellipse ellipse = new Ellipse(50,100);

        ellipse.setFill(Color.SLATEGRAY);
        //ellipse.setStroke(Color.GOLD);
        //ellipse.setStrokeWidth(10);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(rectangle,circle,ellipse);

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
