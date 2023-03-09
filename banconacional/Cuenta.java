package com.banconacional;

public abstract class Cuenta {

    protected Cliente cliente;
    protected double saldo;

    public Cuenta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
    this.saldo += monto;
}

public abstract void extraer(double monto);

public void informarSaldo() {
    System.out.println(this.saldo);
};

}


