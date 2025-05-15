package ro.cts.clase;

public class Tramvai extends InfoMijloaceTrasnport{



    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta<10)
        {
            System.out.println("Ati luat Tramvaiul.");
        }
        else {
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
