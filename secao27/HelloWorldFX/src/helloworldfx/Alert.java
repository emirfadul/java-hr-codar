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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Alert extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{  

        Button buttonInfo = new Button("Alerta de info");

        buttonInfo.setOnAction(event -> showAlert(AlertType.INFORMATION,"Informação", "Alerta de informação"));

        VBox vbox = new VBox(10);

        vbox.getChildren().addAll(buttonInfo);

        //config do stage
        Scene scene = new Scene(vbox,500,500);

                
        // configuração do stage
        primaryStage.setTitle("Exemplo de Alerta");
        primaryStage.setScene(scene);
        primaryStage.show();        
    }

    private void showAlert(AlertType alertType, String title, String message){
        Alert alert = new Alert(alertType);

        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
