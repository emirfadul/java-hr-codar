package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckboxRadioButton extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        //criar checkbox
        CheckBox checkbox1 = new CheckBox("Opção 1");
        CheckBox checkbox2 = new CheckBox("Opção 2");

        Label checkboxLabel = new Label("CheckBox selecionado: ");

        checkbox1.setOnAction(event -> updateCheckboxLabel(checkbox1,checkbox2,checkboxLabel));
        checkbox2.setOnAction(event -> updateCheckboxLabel(checkbox1,checkbox2,checkboxLabel));

        //radio button
        RadioButton radioButton1 = new RadioButton("Opção A");
        RadioButton radioButton2 = new RadioButton("Opção B");

        ToggleGroup toggleGroup = new ToggleGroup();

        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);

        Label radioLabel = new Label("Radio button selecionado: ");

        toggleGroup.selectedToggleProperty().addListener((observable,oldValue,newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();

                radioLabel.setText("Radio button selecionado: " + selectedRadioButton.getText());
            }
        });
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(checkboxLabel,checkbox1,checkbox2,radioLabel,radioButton1,radioButton2);
            
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
