package ro.cts.AdaptorClase.main;

import ro.cts.AdaptorClase.clase.AdaptorClaseMedicament;
import ro.cts.AdaptorClase.clase.Farmacie;
import ro.cts.AdaptorClase.clase.MedicamentFarmacie;
import ro.cts.AdaptorClase.clase.MedicamentSpital;

public class main {
    public static void main(String[] args){
        Farmacie farmacie = new Farmacie("Sanador");

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Strepsils","22.02.2022",true,34.55f);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Nurofen","22.02.2027",true,49.55f);
        farmacie.vindeMedicament(medicamentFarmacie);
        farmacie.vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Paracetamol",43.55f);
        AdaptorClaseMedicament adaptorClaseMedicament = new AdaptorClaseMedicament("Teraflu", 25.55f);
    }
}
