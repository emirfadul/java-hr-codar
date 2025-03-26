package helloworldfx;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ImageViewExample extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{  

        Image image = new Image("file:/home/emir/java/java-hr-codar/secao27/HelloWorldFX/src/helloworldfx/hospedagem_site.png");

        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(400);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(imageView);

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
