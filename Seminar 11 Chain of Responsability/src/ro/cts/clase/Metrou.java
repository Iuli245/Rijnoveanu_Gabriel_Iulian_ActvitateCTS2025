package ro.cts.clase;

public class Metrou extends InfoMijloaceTrasnport{



    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta>10)
        {
            System.out.println("Calatorul trebuie sa ia metroul.");
        }
        else{
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
