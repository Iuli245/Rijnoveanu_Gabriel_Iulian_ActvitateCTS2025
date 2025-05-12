package ro.cts.main;

import ro.cts.clase.Calator;
import ro.cts.clase.Cardcalatorie;
import ro.cts.clase.MetodaDePlata;
import ro.cts.clase.PlataSms;

public class Main {
    public static void main(String[] args) {
        MetodaDePlata metodaDePlataCardCalatorie = new Cardcalatorie(1);
        Calator iuli = new Calator("IULI", metodaDePlataCardCalatorie);

        iuli.platesetBilet(5);
        iuli.setMetodaDePlata(new PlataSms());
        iuli.platesetBilet(5);
        iuli.setMetodaDePlata(metodaDePlataCardCalatorie);
        iuli.platesetBilet(5);


    }
}