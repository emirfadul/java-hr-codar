package helloworldfx;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.stage.*;

public class AlertExample extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{  

        Button buttonInfo = new Button("Alerta de info");
        buttonInfo.setOnAction(event -> showAlert(AlertType.INFORMATION,"Informação", "Alerta de informação"));

        Button buttonError = new Button("Alerta de error");
        buttonError.setOnAction(event -> showAlert(AlertType.ERROR,"ERRO", "Alerta de erro"));

        Button buttonWarning = new Button("Alerta de warning");
        buttonWarning.setOnAction(event -> showAlert(AlertType.WARNING,"Aviso", "Alerta de aviso"));

        Button buttonConfirmation = new Button("Alerta de confirmação");
        buttonConfirmation.setOnAction(event -> showAlert(AlertType.CONFIRMATION,"confirmação", "Alerta de confirmação"));

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(buttonInfo,buttonError,buttonWarning,buttonConfirmation);

        //config do stage
        Scene scene = new Scene(vbox,500,500);
                
        // configuração do stage
        primaryStage.setTitle("Exemplo de Alerta");
        primaryStage.setScene(scene);
        primaryStage.show();        
    }

    private void showAlert(AlertType alertType, String title, String message) {

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
