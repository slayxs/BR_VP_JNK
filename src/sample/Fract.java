package sample;
//Bruchrechner by VP/JNK
//Erstellung der Klasse "Fract" und Zuweisung von Attributen
public class Fract
{
    int zNenner,zZaehler;

    public Fract(int pZaehler,int pNenner) //Bruch immer im Format Fract(Zaehler,Nenner)
    {   zZaehler = pZaehler;
        zNenner = pNenner;
    }

    public int zaehler()
    {
        return zZaehler;
    } // getter - Funktion um Zaehler auszugeben

    public int nenner()
    {
        return zNenner;
    } //getter - Funktion um Nenner auszugeben


    private int ggt(int zahl1, int zahl2) // Funktion um den Kehrwert zu ermitteln
    {
        int zahl3 = 0;
        while (zahl2 != 0)
        {
            zahl3= Math.abs(zahl1) % Math.abs(zahl2);
            zahl1=zahl2;
            zahl2=zahl3;
        }
        return zahl1;
    }

    public void kuerze()    // setter - Methode zum Kürzen des Bruchs
    {
        int ggt = ggt(zZaehler,zNenner);
        zNenner /= ggt;
        zZaehler /= ggt;
    }
}