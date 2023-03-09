public class Asteroide extends Objeto {
    private int lesion;

    public Asteroide(int posicionX, int posicionY, char direccion, int lesion) {
        super(posicionX, posicionY, direccion);
        this.lesion = lesion;
    }

}
