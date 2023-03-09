import java.util.Scanner;

public class Clase3s {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Numeros primos a mostrar: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        int maximo = 2;
        boolean divisible = true;
        int contador = 1;
        System.out.println(2);
            while (contador < numero)
            {
                for (int i = 2; i < maximo; i++) {
                    if(maximo % i  == 0)
                    {
                        divisible = true;
                        break;
                    }
                    else {
                        divisible = false;
                    }
                }

                if (!divisible) {
                    System.out.println(maximo);
                    contador++;
                }

                maximo++;
            }
    }
}
