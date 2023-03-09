public class UsuarioJuego {

private String nombre;
private String clave;
private double puntaje = 0;
private int nivel =0;



//------Metodos-----

public void aumentarPuntaje(){
    puntaje++;
}

    public void subirNivel(){
        nivel++;
    }



public void bonus(double aumento){

    //puntaje = puntaje + aumento;
    puntaje +=aumento;

}








//------------Constructores
    public UsuarioJuego(String nombre, String clave, double puntaje, int nivel) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = puntaje;
        this.nivel = nivel;
    }

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }


//-----------Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
