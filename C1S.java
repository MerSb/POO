/* Para representar cada una de las características de las mascotas, crear una variable y darle
  el valor correspondiente en el IDE IntelliJ. No olvidar darle el tipo adecuado a lo que
  queremos que contenga. Por cada mascota de la veterinaria que figura en la siguiente
  tabla, vamos a tener que mostrar la información del animal. La información va a mostrarse
  como el siguiente ejemplo: “Manchitas tiene 2 años Manchitas come un kilo y medio y hace guau guau” */

public class C1S {

    public static void imprimirAnimal(String animal, String nombre, int edad, float racion, String sonido) {

        System.out.println("El animal es un " + animal + " y se llama " + nombre + ", tiene " + edad + " años, come " + racion + "kg" + " y hace " + sonido);
    }

    public static void main(String[] args) {

        String animal = "Perro";
        String nombre = "Manchitas";
        int edad = 2;
        float racion = 1.5f;
        String sonido = "Guau guau";


        imprimirAnimal(animal, nombre, edad, racion, sonido);

        animal = "Pez";
        nombre = "Nemo";
        edad = 1;
        racion = .140f;
        sonido = "Glu glu";

        imprimirAnimal(animal, nombre, edad, racion, sonido);

        animal = "Gato";
        nombre = "Silvestre";
        edad = 3;
        racion = .5f;
        sonido = "Miau miau";

        imprimirAnimal(animal, nombre, edad, racion, sonido);

        animal = "Tortuga";
        nombre = "Manuelita";
        edad = 12;
        racion = .3f;
        sonido = "Pehuajó";

        imprimirAnimal(animal, nombre, edad, racion, sonido);

        animal = "Canario";
        nombre = "Gardel";
        edad = 1;
        racion = .35f;
        sonido = "Pío pío";

        imprimirAnimal(animal, nombre, edad, racion, sonido);

    }
}
