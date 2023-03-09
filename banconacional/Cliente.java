package com.banconacional;

public class Cliente {

    private int nroCliente;
    private String apellido;
    private int CUIT;
    private int DNI;

    public Cliente(int nroCliente, String apellido, int CUIT, int DNI) {
        this.nroCliente = nroCliente;
        this.apellido = apellido;
        this.CUIT = CUIT;
        this.DNI = DNI;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
