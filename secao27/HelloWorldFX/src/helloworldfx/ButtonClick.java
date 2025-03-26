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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonClick extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{


        Label label = new Label("Clique no botão.");

        Button button = new Button("Clique.");

        button.setOnAction(event ->{
            label.setText("Você clicou no botão");
        });

       
        VBox vbox = new VBox();
        vbox.getChildren().addAll(label,button);
            
        //criando cena com layout
        Scene scene = new Scene(vbox,300,300);
        
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
