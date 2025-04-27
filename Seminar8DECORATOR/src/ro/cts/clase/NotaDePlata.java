package ro.cts.clase;

public class NotaDePlata implements Nota {
    private float totalPlata;

    public NotaDePlata(float totalPlata) {
        this.totalPlata = totalPlata;
    }

    @Override
    public void printare() {
        System.out.println("Aveti de plata suma de "+totalPlata+" RON.");
    }
}
