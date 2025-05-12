package ro.cts.clase;

public class Cardbancar implements MetodaDePlata{

    float sold;

    public Cardbancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(sold >= pretBilet)
        {
            System.out.println("Am platit cu cardul bancar! ");
            sold -=pretBilet;
        }
        else {
            System.out.println("Sold insuficient. ");
        }
    }
}
