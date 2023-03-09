import java.util.List;

public class Editorial {

    private String razonSocial;
    private String telefono;
    private String idTributario;
    private List<Revista>revista;

//-------Metodos Constructores-------


    public Editorial(String razonSocial, String telefono, String idTributario, List<Revista> revista) {
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.idTributario = idTributario;
        this.revista = revista;
    }


    //--------------Getters y Setters-----------


    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdTributario() {
        return idTributario;
    }

    public void setIdTributario(String idTributario) {
        this.idTributario = idTributario;
    }

    public List<Revista> getRevista() {
        return revista;
    }

    public void setRevista(List<Revista> revista) {
        this.revista = revista;
    }
}
