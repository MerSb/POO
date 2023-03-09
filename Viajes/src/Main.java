import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //  Buenos Aires, Luján, Mercedes, Suipacha, Chivilcoy, Alberti y
        //Bragado.

        Reserva reserva1 = new Reserva("654sasd", new Recorrido(Estacion.Bragado, Estacion.Buenos_Aires),"Pepe");
        Reserva reserva2 = new Reserva("098aser", new Recorrido(Estacion.Lujan, Estacion.Suipacha),"Pepe2");
        Reserva reserva3 = new Reserva("lsdkfj", new Recorrido(Estacion.Buenos_Aires, Estacion.Alberti),"Pepe3");
        Reserva reserva4 = new Reserva("sasd", new Recorrido(Estacion.Chivilcoy,Estacion.Buenos_Aires),"Pepe4");


        Viaje tren1 = new Viaje();
        tren1.addReservas(reserva1);
        tren1.addReservas(reserva2);
        tren1.addReservas(reserva3);
        tren1.addReservas(reserva4);

        System.out.println("Recaudacion Total: " + tren1.recaudacionTotal());
        try{
        System.out.println("Cantidad en Buenos Aires = " + tren1.cantVecesRecorrida("Buenos Aires"));
        System.out.println("Verdura " + tren1.cantVecesRecorrida("Verdura"));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Cantidad en Chivilcoy= " + tren1.cantVecesRecorrida("Chivilcoy"));
        System.out.println("Cantidad en Mercedes= " + tren1.cantVecesRecorrida("Mercedes"));



    }
}
