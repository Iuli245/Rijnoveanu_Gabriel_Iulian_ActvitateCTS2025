package ro.cts.clase;

public class ReceptionistFATADA {
    public String poateLuaLocLaMasa(Masa masa1) {
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if (masa1.isEsteLibera()) {
            if (picolo.esteDebarasata(masa1)) {
                if (ospatar.esteAranjataMasa(masa1)) {
                    return "Puteti lua loc la masa " + masa1.getNrMasa();
                } else
                    return "Asteptati sa luati loc la masa. ";
            } else
                return"Asteptati pentru ca tocmai s-a ridicat o persoana.";
        } else
           return "Momentan masa" + masa1.getNrMasa() + " nu este disponibila.";
    }
}
