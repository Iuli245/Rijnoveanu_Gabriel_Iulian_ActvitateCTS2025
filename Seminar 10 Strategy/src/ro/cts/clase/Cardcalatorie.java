package ro.cts.clase;

public class Cardcalatorie implements MetodaDePlata
{
    int nrClatoriiramase;

    public Cardcalatorie(int nrClatoriiramase) {
        this.nrClatoriiramase = nrClatoriiramase;
    }

    @Override
    public void plateste(float pretBilet) {
        if(nrClatoriiramase > 0)
        {
            System.out.println("Am platit cu cardul de calatorii! ");
            nrClatoriiramase -=1;
        }
        else {
            System.out.println("Nu mai ai caltorii ramase. ");
        }

    }
}
