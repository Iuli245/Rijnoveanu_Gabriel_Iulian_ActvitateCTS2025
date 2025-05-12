package ro.cts.clase;

public class Calator implements Observer {
    private String  nume;


    @Override
    public void printareMesaj(String mesaj) {
        System.out.println(this.nume + " , ai primit urmatorul mesaj: "+ mesaj);
    }

    public Calator(String nume) {
        this.nume = nume;
    }
}
