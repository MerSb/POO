package com.banconacional;

public class CuentaCorriente extends Cuenta {

    private double montoAutorizado;


    public CuentaCorriente(Cliente cliente, double saldo, double montoAutorizado) {
        super(cliente, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraer(double monto) {
        if (this.saldo + montoAutorizado >= monto) {
            this.saldo -= monto;
        }

    }
}
