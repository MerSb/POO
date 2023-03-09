public class ServicioTecnico {
    public static void main(String[] args) {

        try {
            Reparacion r = new Reparacion("batidora", 500f);
            r.siguientePaso();
            r.sumaRepuestos(270f);
            r.siguientePaso();
            r.cambiarDireccion("Calle sin nombre 415");
            r.siguientePaso();
            // agregado para que arroje un error
            r.sumaRepuestos(120f);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
