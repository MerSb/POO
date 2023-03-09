import java.util.*;

public class Principal {
    public static void main(String[] args) {

        //Paso1 : crear articulos

        Articulo articulo1 = new Articulo("La vida de las abejas", "Naturaleza",
                "Marco", "15 Abril");

        Articulo articulo2 = new Articulo("Astrologia moderna", "Espacio",
                "Pedro Espacial", "25 mayo");



        // Paso2:  Crear Lista de articulos y agregarlos

        List<Articulo>articulos_deportivos=new ArrayList<>();

       articulos_deportivos.add(articulo1);
       articulos_deportivos.add(articulo2);

       //Paso 3: crear edicion

       Ediciones edicion_ESPN= new Ediciones(1,"30 Octubre", 50.25,articulos_deportivos);

       List<Ediciones> lista_ediciones = new ArrayList<Ediciones>();
       lista_ediciones.add(edicion_ESPN);

       //Paso 4: crear Revista

        Revista billiken = new Revista("Billiken", "ASK6261e","Semanal",lista_ediciones);

        List<Revista> lista_revistas = new ArrayList<>();
        lista_revistas.add(billiken);

        //Paso 5: Creamos la editorial

        Editorial Atlantida = new Editorial("Atlantida S.A.", "54+1153657333",
                "20-926162566-4",lista_revistas);

        System.out.println(Atlantida.getRevista().get(0).getEdiciones().get(0).getArticulos().get(1).getTitulo());




        /*for (Articulo art : articulos) {
            System.out.println("----------");
            System.out.println(art.getAutor());
            System.out.println(art.getFecha());
            System.out.println(art.getTitulo());
            System.out.println(art.getTema());
            System.out.println("---------");
        }*/




    }
}











































