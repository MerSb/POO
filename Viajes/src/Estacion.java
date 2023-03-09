public enum Estacion {
    Buenos_Aires("Buenos Aires", true), Lujan("Luján", false),
    Mercedes("Mercedes",false), Suipacha("Suipacha",false),
    Chivilcoy("Chivilcoy",false), Alberti("Alberti", false),
    Bragado("Bragado", true);

    private String nombre;
    private boolean cabecera;

    private Estacion(String nombre, boolean cabecera) {
        this.nombre = nombre;
        this.cabecera = cabecera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCabecera() {
        return cabecera;
    }

    public void setCabecera(boolean cabecera) {
        this.cabecera = cabecera;
    }
}
