package sample;
//Bruchrechner by VP/JNK
//Mainklasse wird nur zum Starten des Programms verwendet
//sample.fxml ist das XML-Stylefile für die GUI
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Default JAVA-Fx Kram
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); //Festlegen des XML Stylefiles
        primaryStage.setTitle("Bruchrechner"); //Fenstertitel setzen
        primaryStage.setScene(new Scene(root, 600, 400)); //Fenstergröße setzen
        primaryStage.show(); //Einblendung des Fensters
    }

    public static void main(String[] args) {
        launch(args);
    }
}
