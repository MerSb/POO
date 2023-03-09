package com.banconacional;


/*Identificar, modelar e implementar en Java las clases involucradas en el enunciado
        especificando sus atributos, responsabilidades y relaciones entre las mismas.

        El Banco Nacional nos solicita modelar un nuevo sistema. Este sistema llevará el registro de
        las cuentas y de los clientes del banco.
        Clientes: los clientes se identificarán con un número de cliente, con un apellido, un DNI y
        un CUIT.
        Cuentas: las cuentas de nuestro banco permiten depositar, extraer efectivo e informar
        saldo. Una cuenta tiene un cliente asociado.

        Extensión:
        Caja de ahorro: las cajas de ahorro poseen un saldo y además una tasa de interés. En este
        tipo de cuenta se pueden realizar tres operaciones:
        ○ Depositar efectivo: el cliente puede depositar la cantidad de dinero que desee.
        ○ Extraer efectivo: el cliente puede extraer dinero sin excederse de su saldo.
        ○ Cobrar interés: el cliente puede cobrar los intereses que su caja de ahorro le
        otorga mensualmente.
        Cuenta corriente: las cuentas corrientes poseen un saldo y además un monto autorizado
        para girar en descubierto. En este tipo de cuenta se pueden realizar tres operaciones:
        ○ Depositar efectivo: el cliente puede depositar la cantidad de dinero que desee.

        1

        ○ Extraer efectivo: el cliente puede extraer dinero y utilizar su giro en descubierto en
        caso de que no tenga saldo suficiente.

        Aclaración: Para este ejercicio tené en cuenta que Cuenta es posible modelarla como una
        clase abstracta y si bien una cuenta tiene varias responsabilidades como muestra el
        enunciado puede que alguna se tenga que comportar diferente en las subclases y sea
        posible método abstracto.*/

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(120, "Perez", 33333333, 3333333);
        CajaDeAhorro cajaAhorro = new CajaDeAhorro(cliente1, 2000, 5);
        CuentaCorriente ctaCorriente = new CuentaCorriente(cliente1, 6000, 10000);

        cajaAhorro.informarSaldo();
        cajaAhorro.depositar(5000);
        cajaAhorro.informarSaldo();
        cajaAhorro.extraer(1000);
        cajaAhorro.informarSaldo();
        cajaAhorro.cobrarInteres();
        cajaAhorro.informarSaldo();


    }
}
