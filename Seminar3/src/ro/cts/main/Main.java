package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;

public class Main {
    public static  void main(String[] args)
    {
        AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebsite("www.siteNou");
        System.out.println(autoritate2);

        System.out.println(autoritate);

        autoritate2.reglementeazaModel("Audi Q1");
        System.out.println(autoritate2);

        AutoritateReglementareMasiniLazy autoL = AutoritateReglementareMasiniLazy.getInstance("Autoritate1", "www.autoritati");
        System.out.println(autoL);

        AutoritateReglementareMasiniLazy autoL2 = AutoritateReglementareMasiniLazy.getInstance("Autoritate2", "www.autoL");
        System.out.println(autoL2);

    }

}