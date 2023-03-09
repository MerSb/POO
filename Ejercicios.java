import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicios {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

    UsuarioJuego jugador = new UsuarioJuego("Pedro","clave1");

        System.out.println("Puntaje: " + jugador.getPuntaje() + " Nivel: " + jugador.getNivel());

        jugador.aumentarPuntaje();
        jugador.subirNivel();

        System.out.println("Puntaje segunda vez: " + jugador.getPuntaje() + " Nivel segunda vez: " + jugador.getNivel());

        jugador.bonus(2.1);

        System.out.println("Nombre: " + jugador.getNombre() +
              " Clave: " + jugador.getClave() + " Puntaje Final: " + jugador.getPuntaje() +
                " Nivel: " + jugador.getNivel());




        System.out.println("Nombre antes del set: " + jugador.getNombre());
        jugador.setNombre("Jose");

        System.out.println("Nombre despues del set: " + jugador.getNombre());



    }





}


