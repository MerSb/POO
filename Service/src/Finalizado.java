public class Finalizado implements ReparacionState{

    Reparacion reparacion;

    public Finalizado(Reparacion reparacion) {
        this.reparacion = reparacion;
        System.out.println("Finalizado: ");
        reparacion.mostrar();
    }

    @Override
    public void cambiaDireccion(String nuevaDireccion) throws Exception {
        throw new Exception("No puede cambiar el Presupuesto en Finalizado");
    }

    @Override
    public void valorPresupuesto(float valor) throws Exception {
        throw new Exception("No puede cambiar el Presupuesto en Finalizado");
    }

    @Override
    public void sumarRepuestos(float valor) throws Exception {
        throw new Exception("No puede sumar repuestos en Finalizado");
    }

    @Override
    public void siguientePaso() throws Exception {
        throw new Exception("No hay siguiente");
    }


}
