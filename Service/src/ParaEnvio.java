public class ParaEnvio implements ReparacionState{

    Reparacion reparacion;

    public ParaEnvio(Reparacion reparacion) {
        this.reparacion = reparacion;
        System.out.println("Para Envio: ");
        reparacion.mostrar();
    }

    @Override
    public void cambiaDireccion(String nuevaDireccion) throws Exception {
        reparacion.setDireccion(nuevaDireccion);
    }

    @Override
    public void valorPresupuesto(float valor) throws Exception {
        throw new Exception("No puede cambiar el Presupuesto en Para enviar");
    }

    @Override
    public void sumarRepuestos(float valor) throws Exception {
        throw new Exception("No puede sumar repuestos en ParaEnviar");
    }

    @Override
    public void siguientePaso() throws Exception {
        this.reparacion.setEstado(FactoryEstado.getInstance().setEstado("Finalizado",reparacion));
    }
}
