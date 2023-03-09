public class EnReparacion implements ReparacionState{

    Reparacion reparacion;

    public EnReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
        System.out.println("En Reparacion: ");
        reparacion.mostrar();
    }

    @Override
    public void cambiaDireccion(String nuevaDireccion) throws Exception {
        throw new Exception("No puede cambiar la direccion mientras esta En Reparacion");
    }

    @Override
    public void valorPresupuesto(float valor) throws Exception {
        throw new Exception("No puede asignar valor al presupuesto en reparacion");
    }

    @Override
    public void sumarRepuestos(float valor) throws Exception {
        reparacion.setPresupuestado(reparacion.getPresupuestado()+ valor);
    }

    @Override
    public void siguientePaso() throws Exception {
        this.reparacion.setEstado(FactoryEstado.getInstance().setEstado("ParaEnvio", reparacion));
    }
}
