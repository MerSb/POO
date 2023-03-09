import java.util.Scanner;
/*
Objetivo
El objetivo es poder practicar el uso de la sintaxis del lenguaje de programación Java.
Ejercicio 1
Ingresa tu nombre y tu apellido por separado, a partir de estas variables obtener en una
tercera tus iniciales y tu fecha de nacimiento, para la fecha ingresa, 3 valores que
representan día, mes y año.
Luego muestra un mensaje, como si fuera una ficha, con tu nombre completo. Las iniciales
de tu nombre y apellido y tu fecha de nacimiento con el formato “dd/mm/aaaa”
Nota: Utilizar alguna función para resolver, por ejemplo una que dados los 3 valores
devuelve la fecha como un string.
¡Hasta la próxima!

 */

public class Clase2s {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 1:");
        System.out.println("Tu Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Tu Apellido:");
        String apellido = scanner.nextLine();

        String iniciales = nombre.substring(0,1) + apellido.substring(0,1);

        System.out.println("Tu dia de Nacimiento:");
        String dia = scanner.nextLine();

        System.out.println("Tu mes de Nacimiento:");
        String mes = scanner.nextLine();

        System.out.println("Tu año de Nacimiento:");
        String anio = scanner.nextLine();

        String fechaNacimiento = ConvertirAFormatoFecha(dia, mes, anio);

        System.out.println("Nombre: " + nombre +"\nApellido: " + apellido + "\nIniciales: "
                + iniciales +"\nFecha de Nacimiento: " + fechaNacimiento);
    }

    public  static String ConvertirAFormatoFecha(String dia, String mes, String anio)
    {
        String fecha  ="";

        if(dia.length()<2){
            dia ="0"+ dia;
        }
        if(mes.length()<2){
            mes ="0"+ mes;
        }

        if(anio.length()==2){
            anio ="20"+ anio;
        }
        fecha = dia+"/"+mes+"/"+anio;
        return fecha;
    }
}
