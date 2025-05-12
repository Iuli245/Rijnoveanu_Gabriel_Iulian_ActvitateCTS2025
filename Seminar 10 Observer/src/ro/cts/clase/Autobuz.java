package ro.cts.clase;

public class Autobuz extends  MijlocTransport{
    public Autobuz(int numarLinie){
        super(numarLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul cu nr: "+this.getNrLinie()+" pleaca de la capatul liniei");
    }

    public void schimbaTraseu(){
        trimiteMesaj("Traseul se va schimba pentru autobuzul cu linia "+this.getNrLinie()+" si va circula pe Blv Balcescu si nu va mai opri la Piata romana.");
    }
}
