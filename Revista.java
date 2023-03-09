import java.util.List;

public class Revista {

    private String nombre;
    private String codigo;
    private String periodicidad;
    private List<Ediciones>ediciones;


    //-------Metodos Constructores

    public Revista(String nombre, String codigo, String periodicidad, List<Ediciones> ediciones) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodicidad = periodicidad;
        this.ediciones = ediciones;
    }


    //-------Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public List<Ediciones> getEdiciones() {
        return ediciones;
    }

    public void setEdiciones(List<Ediciones> ediciones) {
        this.ediciones = ediciones;
    }
}
