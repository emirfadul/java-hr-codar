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

public class ComboBoxListView extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        //combobox
        ComboBox<String> comboBox = new ComboBox<>();

        comboBox.getItems().addAll("Opção 1","Opção 2","Opção 3");

        comboBox.setPromptText("Selecione uma opção:");      
        
        Label comboBoxLabel = new Label("Seleção na ComboBox: ");

        comboBox.setOnAction(event -> {
            String selected = comboBox.getSelectionModel().getSelectedItem();

            comboBoxLabel.setText("Seleção na ComboBox: "+selected);
        });

        //listview
        ObservableList<String> items = FXCollections.observableArrayList("item a","item b","item c", "item d");

        ListView<String> listView = new ListView<>(items);

        listView.setPrefHeight(150);

        Label listViewLabel = new Label("Seleção na ComboBox: ");

        listView.getSelectionModel().selectedItemProperty().addListener((observale,oldValue,newValue) -> {

            listViewLabel.setText("Seleção na list view: "+newValue);
        });

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(comboBoxLabel,comboBox,listViewLabel,listView);
            
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
