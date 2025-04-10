package ro.cts.AdaptorClase.clase;

public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie)
    {
        System.out.println("Farmacia "+ this.nume +" vinde produsul. ");
        medicamentFarmacie.cumparaMedicament();
    }
}
