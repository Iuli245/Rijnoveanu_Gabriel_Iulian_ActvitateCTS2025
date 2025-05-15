package ro.cts.clase;

public abstract class InfoMijloaceTrasnport {
    private InfoMijloaceTrasnport urmMijloc;

    public InfoMijloaceTrasnport(InfoMijloaceTrasnport urmMijloc) {
        this.urmMijloc = urmMijloc;
    }

    public InfoMijloaceTrasnport(){};


    public InfoMijloaceTrasnport getUrmMijloc() {
        return urmMijloc;
    }

    public void setUrmMijloc(InfoMijloaceTrasnport urmMijloc) {
        this.urmMijloc = urmMijloc;
    }

    public abstract void recomandaMijloc(int distanta);
}
