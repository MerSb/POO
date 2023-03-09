public class Perro {

    private boolean estaEnAdopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombre;

    public Perro(boolean estaEnAdopcion, String raza, int anioNacimiento, double peso, boolean tieneChip, boolean estaLastimado, String nombre) {
        this.estaEnAdopcion = estaEnAdopcion;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }

    public Perro(boolean estaEnAdopcion, String raza, int anioNacimiento, double peso) {
        this.estaEnAdopcion = estaEnAdopcion;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
    }

    public boolean isEstaEnAdopcion() {
        return estaEnAdopcion;
    }

    public void estaEnAdopcion(boolean estaEnAdopcion) {
        this.estaEnAdopcion = estaEnAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void tieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void enviarAdopcion() {
        if(!this.estaLastimado & this.estaEnAdopcion & this.peso >= 5) {
            this.estaEnAdopcion = false;
            System.out.println("El perrito " + this.nombre + " fue adoptado");

        } else {
            System.out.println("No se puede adoptar");
        }
    }

    public void sePuedePerder() {

        if (this.tieneChip) {
            System.out.println("El perro no se puede perder");
        } else {
            System.out.println("El perro se te va a perder");
        }

    }
}
