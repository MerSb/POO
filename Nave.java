public class Nave extends Objeto{
    private Double velocidad;
    private int vida;

    public Nave(int posicionX, int posicionY, char direccion, Double velocidad) {
        super(posicionX, posicionY, direccion);
        this.velocidad = velocidad;
    }

    public void girar(char pepe){
        super.setDireccion(pepe);
    }

    public void restaVida(int quitar){
        this.vida -=  quitar;
    }

    @Override
    public void irA(int posicionX, int posicionY, char direccion) {
        if(direccion != getDireccion()){
            girar(direccion);
        }
        setPosicionX(posicionX);
        setPosicionY(posicionY);
    }

    @Override
    public String toString() {
        return "Nave:" +
                "\nPosicion X " + getPosicionX() +
                "\nPosicion Y " + getPosicionY() +
                "\nvelocidad = " + velocidad +
                "\nvida = " + vida;
    }


}
