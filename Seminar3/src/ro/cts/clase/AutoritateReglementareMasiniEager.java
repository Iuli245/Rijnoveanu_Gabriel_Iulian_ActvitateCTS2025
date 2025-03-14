package ro.cts.clase;

public class AutoritateReglementareMasiniEager {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasiniEager instance = new AutoritateReglementareMasiniEager();

    @Override
    public String toString() {
        return "AutoritateReglementareMasiniEager{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }

    private AutoritateReglementareMasiniEager(){

    }

    private AutoritateReglementareMasiniEager(String nume, String website, int nrReglementari)
    {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void reglementeazaModel(String nume)
    {
        this.nrReglementari++;
    }

    public static AutoritateReglementareMasiniEager getInstance()
    {
        return instance;
    }

}
