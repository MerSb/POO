public class EnPresupuesto implements ReparacionState{


    Reparacion reparacion;

    public EnPresupuesto(Reparacion reparacion) {
        this.reparacion = reparacion;
        System.out.println("En Presupuesto: ");
        reparacion.mostrar();
    }

    @Override
    public void cambiaDireccion(String nuevaDireccion) throws Exception {
        throw new Exception("No puede cambiar la direccion mientras esta En Presupuesto");
    }

    @Override
    public void valorPresupuesto(float valor) throws Exception {
        reparacion.setPresupuestado(valor);
    }

    @Override
    public void sumarRepuestos(float valor) throws Exception {
        throw new Exception("No puede sumar respuestos mientras esta En Presupuesto");
    }

    @Override
    public void siguientePaso() throws Exception {
        this.reparacion.setEstado(FactoryEstado.getInstance().setEstado("EnReparacion", reparacion));
    }

}
