package ro.cts.registry;

public class Reglementare {
    private String model;
    private int nrReglementare;
    private String dataReglementare;


    public Reglementare(String model, int nrReglementare, String dataReglementare) {
        this.model = model;
        this.nrReglementare = nrReglementare;
        this.dataReglementare = dataReglementare;
    }

    @Override
    public String toString() {
        return "Reglementare{" +
                "model='" + model + '\'' +
                ", nrReglementare=" + nrReglementare +
                ", dataReglementare='" + dataReglementare + '\'' +
                '}';
    }
}
