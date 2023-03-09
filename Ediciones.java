import java.util.List;

public class Ediciones {

    private int numero;
    private String fecha;
    private double precio;
    private List<Articulo> articulos;//nombre lista



    //---Metodos constructores


    public Ediciones(int numero, String fecha, double precio, List<Articulo> articulos) {
        this.numero = numero;
        this.fecha = fecha;
        this.precio = precio;
        this.articulos = articulos;
    }


    //---------Getters y Setters


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}
