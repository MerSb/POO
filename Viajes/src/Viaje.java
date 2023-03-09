import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Viaje {
    private List<Reserva> reservas;

    public Viaje() {
        this.reservas = new ArrayList<>();
    }

    public void addReservas(Reserva reserva){
        reservas.add(reserva);
    }

    public Double recaudacionTotal(){
        Double recaudacion = 0.0;
        for (Reserva r:reservas) {
            recaudacion += r.getPrecio();
        }
        return recaudacion;
    }

    public int cantVecesRecorrida(String estacion){

        if(!Arrays.stream(Estacion.values()).anyMatch((e)-> e.getNombre().equals(estacion))){
            throw new RuntimeException("Estacion no valida");
        }

        int cantidad = 0;
        for (Reserva r:reservas) {
            if(r.getRecorrido().getOrigen().getNombre().equals(estacion) || r.getRecorrido().getDestino().getNombre().equals(estacion)){
                cantidad++;
            }
        }

        return cantidad;
    }
}
