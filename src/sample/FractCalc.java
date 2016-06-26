package sample;

public class FractCalc
{

    public FractCalc()
    {

    }

    public Fract Summe(Fract bruch1, Fract bruch2)
    {
        int zZaehler, zNenner;

        zZaehler = bruch2.zaehler() * bruch1.nenner() + bruch1.zaehler() * bruch2.nenner();
        zNenner = bruch2.nenner() * bruch1.nenner();

        Fract br = new Fract(zZaehler, zNenner);        //Neuer Bruch wird erzeugt

        br.kuerze();

        return br;
    }

    public Fract Differenz(Fract bruch1, Fract bruch2)
    {
        return Summe( new Fract(bruch1.zaehler(), bruch1.nenner()) ,
                new Fract (-bruch2.zaehler(),bruch2.nenner()));

    }

    public Fract Quotient(Fract bruch1, Fract bruch2)
    {
        int zZaehler, zNenner;

        zZaehler = bruch2.nenner() * bruch1.zaehler();
        zNenner = bruch2.zaehler() * bruch1.nenner();
        Fract br = new Fract(zZaehler, zNenner);

        br.kuerze();

        return br;
    }

    public Fract Produkt(Fract bruch1, Fract bruch2)
    {
        int zZaehler, zNenner;

        zNenner = bruch2.nenner() * bruch1.nenner();
        zZaehler = bruch2.zaehler() * bruch1.zaehler();
        Fract br = new Fract(zZaehler, zNenner);

        br.kuerze();

        return br;
    }

}