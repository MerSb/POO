public class Reparacion {
    private String articulo;
    private float presupuestado;
    private String direccion;
    private ReparacionState estado;


    public Reparacion(String articulo, float presupuestado) throws Exception {
        this.articulo = articulo;
        this.presupuestado = presupuestado;
        this.estado = FactoryEstado.getInstance().setEstado("EnPresupuesto", this);
    }


    public void cambiarDireccion(String nuvevaDireccion) throws Exception {
        getEstado().cambiaDireccion(nuvevaDireccion);
    }
    public void valorPresupuesto(float valor) throws Exception {
        getEstado().valorPresupuesto(valor);
    }
    public void sumaRepuestos(float valor) throws Exception {
        getEstado().sumarRepuestos(valor);
    }
    public void siguientePaso() throws Exception {
        getEstado().siguientePaso();
    }

    public ReparacionState getEstado(){
        return estado;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public float getPresupuestado() {
        return presupuestado;
    }

    public void setPresupuestado(float presupuestado) {
        this.presupuestado = presupuestado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstado(ReparacionState estado) {
        this.estado = estado;
    }

    public void mostrar(){
        System.out.println("Nombre: " + this.articulo);
        System.out.println("Presupuesto: " + this.presupuestado);
        System.out.println("Domicilio: " + this.direccion);
        System.out.println("=================================");

    }

}
