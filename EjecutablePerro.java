public class EjecutablePerro {

    public static void main(String[] args) {

        Perro perroEntrante = new Perro(true, "caniche", 1960, 5.5, true, true, "Pepito");

        perroEntrante.enviarAdopcion();
        System.out.println(perroEntrante.isEstaEnAdopcion());

        perroEntrante.sePuedePerder();


    }
}
