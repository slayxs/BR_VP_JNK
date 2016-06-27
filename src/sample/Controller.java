package sample;
// Bruchrechner , VP / JNK
//Imports
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//Bruchrechner by VP/JNK
//Klasse Controller wird definiert
public class Controller {

    //Erstellung von von Objekten (Bezeichnungen identisch mit fx:id's aus dem Stylefile der GUI - sample.fxml)
    public TextField zaehler1 = new TextField("1");
    public TextField nenner1 = new TextField("1");
    public TextField zaehler2 = new TextField("1");
    public TextField nenner2 = new TextField("1");
    public Label result;
    public TextField resultZ;
    public TextField resultN;
    public Label resultDeci;
    public Button minusbutton;
    public Button malbutton;
    public Button teilbutton;
    public Button plusbutton;

    //Funktion zum Erfassen des Inhalts der Textfelder - GETTER

    public int Input1(){
        int Input1 = Integer.parseInt(zaehler1.getText());
        return Input1;
    }
    public int Input2(){
        int Input2 = Integer.parseInt(nenner1.getText());
        return Input2;
    }
    public int Input3(){
        int Input3 = Integer.parseInt(zaehler2.getText());
        return Input3;
    }
    public int Input4(){
        int Input4 = Integer.parseInt(nenner2.getText());
        return Input4;
    }

    //Methode die beim Event "onMouseClicked" auf Button Addieren ausgeführt wird
    public void Addieren(Event event) {
        Fract FR1 = new Fract(Input1(), Input2()); //Erstellung des ersten Bruchs
        Fract FR2 = new Fract(Input3(), Input4()); //Erstellung des zweiten Bruchs
        FractCalc Add = new FractCalc(); //Neues Objekt aus der Klasse FractCalc wird erstellt
        int Z1 = Add.Summe(FR1,FR2).zaehler(); // Objekt "Add" wird mit der Funktion "Summe" berechnet - Zähler
        int N2 = Add.Summe(FR1,FR2).nenner(); // Das selbe wie oben nur für den Nenner
    //Ausgabe des Ergebnisses
        result.setText("Ergebnis Addition: ");
        resultZ.setText("" + Z1 );
        resultN.setText("" + N2 );
        resultDeci.setText("oder auch: " + (double)Z1 / N2);
    }

    public void Subtrahieren(Event event) {
        Fract FR1 = new Fract(Input1(), Input2());
        Fract FR2 = new Fract(Input3(), Input4());
        FractCalc Sub = new FractCalc();
        int Z1 = Sub.Differenz(FR1,FR2).zaehler();
        int N2 = Sub.Differenz(FR1,FR2).nenner();

        result.setText("Ergebnis Subtraktion: ");
        resultZ.setText("" + Z1 );
        resultN.setText("" + N2 );
        resultDeci.setText("oder auch: " + (double)Z1 / N2);
    }

    public void Multiplizieren(Event event) {
        Fract FR1 = new Fract(Input1(), Input2());
        Fract FR2 = new Fract(Input3(), Input4());
        FractCalc Mul = new FractCalc();
        int Z1 = Mul.Produkt(FR1,FR2).zaehler();
        int N2 = Mul.Produkt(FR1,FR2).nenner();

        result.setText("Ergebnis Multiplikation: ");
        resultZ.setText("" + Z1 );
        resultN.setText("" + N2 );
        resultDeci.setText("oder auch: " + (double)Z1 / N2);
    }

    public void Dividieren(Event event) {
        Fract FR1 = new Fract(Input1(), Input2());
        Fract FR2 = new Fract(Input3(), Input4());
        FractCalc Div = new FractCalc();
        int Z1 = Div.Quotient(FR1,FR2).zaehler();
        int N2 = Div.Quotient(FR1,FR2).nenner();

        result.setText("Ergebnis Division: ");
        resultZ.setText("" + Z1 );
        resultN.setText("" + N2 );
        resultDeci.setText("oder auch: " + (double)Z1 / N2);
    }


}
