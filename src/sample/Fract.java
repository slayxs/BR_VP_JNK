package sample;

public class Fract
{
    int zNenner,zZaehler;

    public Fract(int pZaehler,int pNenner)
    {   zZaehler = pZaehler;
        zNenner = pNenner;
    }

    public int zaehler()
    {
        return zZaehler;
    }

    public int nenner()
    {
        return zNenner;
    }


    private int ggt(int zahl1, int zahl2)
    {
        int zahl3;
        while (zahl2 > 0)
        {
            zahl3=zahl1 % zahl2;
            zahl1=zahl2;
            zahl2=zahl3;
        }
        return zahl1;
    }

    public void kuerze()
    {
        int ggt = ggt(zNenner,zZaehler);
        zNenner /= ggt;
        zZaehler /= ggt;
    }
}