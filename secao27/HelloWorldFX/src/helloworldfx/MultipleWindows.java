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

public class MultipleWindows extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{  

        Button button = new Button("Abrir janela secundária");

        button.setOnAction(event -> openSecondaryWindow());

        StackPane primaryLayout = new StackPane();

        primaryLayout.getChildren().add(button);

        Scene primaryScene = new Scene(primaryLayout, 500,500);
                
        // configuração do stage
        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(primaryScene);
        primaryStage.show();        
    }

    public void openSecondaryWindow(){

        Stage secondaryStage = new Stage();

        Label label = new Label("Janela Secundária");

        StackPane secondaryLayout = new StackPane();

        secondaryLayout.getChildren().add(label);

        Scene secondaryScene = new Scene(secondaryLayout,500,500);

        secondaryStage.setTitle("Janela secundaria");
        secondaryStage.setScene(secondaryScene);
        secondaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
