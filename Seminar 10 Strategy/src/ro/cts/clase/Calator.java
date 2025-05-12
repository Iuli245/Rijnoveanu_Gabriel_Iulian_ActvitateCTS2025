package ro.cts.clase;

public class Calator {
    String nume;
    MetodaDePlata metodaDePlata;

    public Calator(String nume) {
        this.nume = nume;
        this.metodaDePlata = new Cardbancar(10);//mod implicit card bancar
    }

    public Calator(String nume, MetodaDePlata metodaDePlata) {
        this.nume = nume;
        this.metodaDePlata = metodaDePlata; //mod de plata specificat de utilizator in main
    }

    public void setMetodaDePlata(MetodaDePlata metodaDePlata) {
        this.metodaDePlata = metodaDePlata;
    }

    public void platesetBilet(float pretBilet){
        metodaDePlata.plateste(pretBilet);
    }


}
