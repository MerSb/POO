import java.util.List;

public class Recorrido {
    private Estacion origen;
    private Estacion destino;

    public Recorrido(Estacion origen, Estacion destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public Estacion getOrigen() {
        return origen;
    }

    public void setOrigen(Estacion origen) {
        this.origen = origen;
    }

    public Estacion getDestino() {
        return destino;
    }

    public void setDestino(Estacion destino) {
        this.destino = destino;
    }

}
