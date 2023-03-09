public class Reserva {
    private String codigo;
    private Recorrido recorrido;
    private String pasajero;
    private Double precio = 50.0;


    public Reserva(String codigo, Recorrido recorrido, String pasajero) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.pasajero = pasajero;
        this.precio = calcularPrecio(recorrido);
    }

    private Double calcularPrecio(Recorrido recorrido) {
        if(this.recorrido.getOrigen().isCabecera() && this.recorrido.getDestino().isCabecera())
        {
            return  precio * 0.8;
        }
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}

