package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldTextArea extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        //text field
        TextField textField = new TextField();
        textField.setPromptText("Digite seu nome.....");  
        
        TextField textField2= new TextField();
        textField.setPromptText("Digite sua idade....");     

        //limitar os caracteres
        textField2.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > 3) {
                textField2.setText(oldValue);                
            }
        });

        //text area

        TextArea textArea = new TextArea();
        textArea.setPromptText("Como foi seu dia...");
        textArea.setPrefRowCount(5);

        Label label = new Label("Texto do TextArea");

        textArea.textProperty().addListener((observable,oldValue,newValue) -> {
            label.setText("Texto do textArea: "+newValue);
                        
            
        });


        VBox vbox = new VBox();
        vbox.getChildren().addAll(textField,textField2,textArea, label);
            
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
