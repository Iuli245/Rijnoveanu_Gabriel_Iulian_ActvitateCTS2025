package ro.cts.clase;

public class Autobuz extends InfoMijloaceTrasnport {



    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta <5)
        {
            System.out.println("Calatorul va lua autobzul");
        }
        else
        {
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
