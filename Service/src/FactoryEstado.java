public class FactoryEstado {

    static FactoryEstado instance;

    public FactoryEstado() {
    }

    public static FactoryEstado getInstance() {
        if(instance == null){
            instance = new FactoryEstado();
        }
        return instance;
    }

    public ReparacionState setEstado(String tipo, Reparacion r) throws Exception
    {

        switch (tipo){
            case "EnPresupuesto":
                return new EnPresupuesto(r);
            case "EnReparacion":

                return new EnReparacion(r);
            case "Finalizado":
                return new Finalizado(r);
            case "ParaEnvio":
                return new ParaEnvio(r);
            default:
                throw new Exception("Estado no valido");
        }


    }
}
