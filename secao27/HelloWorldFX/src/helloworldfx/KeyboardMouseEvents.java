package helloworldfx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KeyboardMouseEvents extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        Label label = new Label("Interaja com seu teclado.");

        StackPane root = new StackPane();

        root.getChildren().add(label);

        //capturar teclado
        root.setOnKeyPressed(event ->{
            String key = event.getCode().toString();

            label.setText("Tecla pressionada: "+key);
        });

        //evento de mouse
        root.setOnMouseClicked(event ->{

            double x = event.getSceneX();
            double y = event.getSceneY();

            label.setText("Mouse clicado em X: "+x+" e Y: "+y);
        });

        //criando cena com layout
        Scene scene = new Scene(root,500,500);

        //habilitando os eventos de tecla
        scene.setOnKeyPressed(root.getOnKeyPressed());
        
        // configuração do stage
        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();        
    }

    public void updateCheckboxLabel(CheckBox cb1, CheckBox cb2, Label label){

        String selected = "Checkbox selecionado: ";

        if(cb1.isSelected()) selected += cb1.getText() + " ";
        if(cb2.isSelected()) selected += cb2.getText();

        label.setText(selected);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
