package sample;
//Bruchrechner by VP/JNK
//Erstellung der Klasse FractCalc - diese Klasse beinhaltet die Funktionen für die Berechnung der Brüche
public class FractCalc
{
    //Default-Konstruktor
    public FractCalc()
    {
    }

    //Fuktion um die Summe zu berechnen, Zwei Brüche müssen mitgegeben werden
    public Fract sum(Fract bruch1, Fract bruch2)
    {
        int zZaehler, zNenner;

        zZaehler = bruch2.zaehler() * bruch1.nenner() + bruch1.zaehler() * bruch2.nenner(); // Mathematische Logik
        zNenner = bruch2.nenner() * bruch1.nenner(); // Mathematische Logik
        Fract br = new Fract(zZaehler, zNenner);        //Erzeugen des neuen Bruchs
        br.kuerze();                                //Methode aus der Klasse Fract zum kuerzen wird aufgerufen

        return br;  //der addierte und gekürzte Bruch wird returned
    }

    public Fract differenz(Fract bruch1, Fract bruch2)
    {
        return sum( new Fract(bruch1.zaehler(), bruch1.nenner()) ,
                new Fract (-bruch2.zaehler(),bruch2.nenner()));

    }

    public Fract quotient(Fract bruch1, Fract bruch2)
    {
        int zZaehler, zNenner;

        zZaehler = bruch2.nenner() * bruch1.zaehler();
        zNenner = bruch2.zaehler() * bruch1.nenner();
        Fract br = new Fract(zZaehler, zNenner);

        //br.kuerze();

        return br;
    }

    public Fract produkt(Fract bruch1, Fract bruch2)
    {
        int zZaehler, zNenner;

        zNenner = bruch2.nenner() * bruch1.nenner();
        zZaehler = bruch2.zaehler() * bruch1.zaehler();
        Fract br = new Fract(zZaehler, zNenner);

        br.kuerze();

        return br;
    }

}