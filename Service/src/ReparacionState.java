public interface ReparacionState {

    void cambiaDireccion(String nuevaDireccion) throws Exception;
    void valorPresupuesto(float valor)throws Exception;
    void sumarRepuestos(float valor)throws Exception;
    void siguientePaso()throws Exception;

}
