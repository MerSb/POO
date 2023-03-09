package com.banconacional;

public class CajaDeAhorro extends Cuenta {

    private double tasaInteres;

    public CajaDeAhorro(Cliente cliente, double saldo, double tasaInteres) {
        super(cliente, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraer(double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
        }
    }

    public void cobrarInteres() {
        this.saldo = this.saldo * this.tasaInteres / 100;

    }

}
