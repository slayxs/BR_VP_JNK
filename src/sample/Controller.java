package sample;
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

    public int input1(){
        int Input1 = Integer.parseInt(zaehler1.getText());
        return Input1;
    }
    public int input2(){
        int Input2 = Integer.parseInt(nenner1.getText());
        return Input2;
    }
    public int input3(){
        int Input3 = Integer.parseInt(zaehler2.getText());
        return Input3;
    }
    public int input4(){
        int Input4 = Integer.parseInt(nenner2.getText());
        return Input4;
    }

    //Methode die beim Event "onMouseClicked" auf Button Addieren ausgeführt wird
    public void add(Event event) {
        Fract fr1 = new Fract(input1(), input2()); //Erstellung des ersten Bruchs
        Fract fr2 = new Fract(input3(), input4()); //Erstellung des zweiten Bruchs
        FractCalc Add = new FractCalc(); //Neues Objekt aus der Klasse FractCalc wird erstellt
        int z1 = Add.sum(fr1,fr2).zaehler(); // Objekt "Add" wird mit der Funktion "Summe" berechnet - Zähler
        int n2 = Add.sum(fr1,fr2).nenner(); // Das selbe wie oben nur für den Nenner
    //Ausgabe des Ergebnisses
        result.setText("Ergebnis Addition: ");
        showResult(z1,n2);
        resultDeci.setText("oder auch: " + (double)z1 / n2);
    }

    public void subtract(Event event) {
        Fract fr1 = new Fract(input1(), input2());
        Fract fr2 = new Fract(input3(), input4());
        FractCalc Sub = new FractCalc();
        int z1 = Sub.differenz(fr1,fr2).zaehler();
        int n2 = Sub.differenz(fr1,fr2).nenner();

        result.setText("Ergebnis Subtraktion: ");
        showResult(z1,n2);
        resultDeci.setText("oder auch: " + (double)z1 / n2);
    }

    public void multiply(Event event) {
        Fract fr1 = new Fract(input1(), input2());
        Fract fr2 = new Fract(input3(), input4());
        FractCalc Mul = new FractCalc();
        int z1 = Mul.produkt(fr1,fr2).zaehler();
        int n2 = Mul.produkt(fr1,fr2).nenner();

        result.setText("Ergebnis Multiplikation: ");
        showResult(z1,n2);
        resultDeci.setText("oder auch: " + (double)z1 / n2);
    }

    public void divide(Event event) {
        Fract fr1 = new Fract(input1(), input2());
        Fract fr2 = new Fract(input3(), input4());
        FractCalc Div = new FractCalc();
        int z1 = Div.quotient(fr1,fr2).zaehler();
        int n2 = Div.quotient(fr1,fr2).nenner();

        result.setText("Ergebnis Division: ");
        showResult(z1,n2);
        resultDeci.setText("oder auch: " + (double)z1 / n2);
    }
    
    // Methode, um Ergebnis mit negativen Werten zu behandeln
	private void showResult(int z1, int n2) {
		if (n2 < 0){
        	resultZ.setText("" + (-1*z1) );
        	resultN.setText("" + (-1*n2) );
		} else {
        	resultZ.setText("" + z1 );
        	resultN.setText("" + n2 );
        }	
	}
}
