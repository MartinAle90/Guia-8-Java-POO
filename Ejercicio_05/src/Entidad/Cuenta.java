/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Martin
 */
public class Cuenta {

    private int numeroCuenta;
    private long dniCliente;
    private int saldo;
    private double intereses;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, int saldo, double intereses) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldo = saldo;
        this.intereses = intereses;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

}
