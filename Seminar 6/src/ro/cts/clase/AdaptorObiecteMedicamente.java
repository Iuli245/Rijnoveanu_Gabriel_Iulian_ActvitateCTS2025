package ro.cts.clase;

public class AdaptorObiecteMedicamente extends MedicamentFarmacie{

    MedicamentSpital medicamentSpital;

    public AdaptorObiecteMedicamente(String numeMedicament, String dataExpirare, boolean esteInStoc, float pret) {
        super(numeMedicament, dataExpirare, esteInStoc, pret);
    }

    public AdaptorObiecteMedicamente( MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNumeMedicament(), "25.05.2027", true,  medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitionareMedicament();
    }
}
