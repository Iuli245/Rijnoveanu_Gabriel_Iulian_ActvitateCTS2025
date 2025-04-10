package ro.cts.AdaptorClase.clase;

public class AdaptorClaseMedicament extends MedicamentSpital implements IMedicamentFarmacie{
    public AdaptorClaseMedicament(String numeMedicament, float pret)
    {
        super(numeMedicament,pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitionareMedicament();
    }
}
