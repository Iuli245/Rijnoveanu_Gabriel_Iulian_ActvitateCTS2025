package ro.cts.AdaporObiecte.clase;

public class MedicamentFarmacie {
    private String numeMedicament;
    private String dataExpirare;
    private boolean esteInStoc;
    private float pret;


    public MedicamentFarmacie(String numeMedicament, String dataExpirare, boolean esteInStoc, float pret) {
        this.numeMedicament = numeMedicament;
        this.dataExpirare = dataExpirare;
        this.esteInStoc = esteInStoc;
        this.pret = pret;
    }

    public void cumparaMedicament()
    {
        System.out.println(" Medicamentul"+ this.numeMedicament+" care expirta la: " + dataExpirare + " are pretul de: " + this.pret+".");
    }

}
