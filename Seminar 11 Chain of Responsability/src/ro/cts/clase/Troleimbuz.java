package ro.cts.clase;

public class Troleimbuz extends  InfoMijloaceTrasnport{



    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta<3)
        {
            System.out.println("Calatorul trebuie sa ia troleimbuzul.");

        }
        else {
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
