public class Main {

    public static void main(String[] args) {
        Nave n1 = new Nave(100,100, 'O',25.8);

        Asteroide a1 = new Asteroide(50,50,'E',50);

        System.out.println(n1.toString());

        n1.irA(500,300,'S');

        System.out.println(n1.toString());

        a1.irA(120,150,'N');

    }
}
