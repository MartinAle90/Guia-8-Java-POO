/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioCuenta {

    Scanner entrada = new Scanner(System.in);

    public Cuenta crearCuenta() {

        Cuenta cuentax = new Cuenta();
        System.out.println("ingrese su numero de cuenta");
        int numeroCuenta = entrada.nextInt();
        System.out.println("ingrese su DNI");
        long dniCliente = entrada.nextInt();
        System.out.println("ingrese su saldo");
        int saldo = entrada.nextInt();

        cuentax.setNumeroCuenta(numeroCuenta);
        cuentax.setDniCliente(dniCliente);
        cuentax.setSaldo(saldo);

        return cuentax;
    }

//    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual. 
    public void ingresarDinero(Cuenta cuentax, double ingreso) {

        double saldoF = cuentax.getSaldo();
        saldoF += ingreso;
        cuentax.setSaldo((int) saldoF);

    }

//    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0. 
    public void retirarDinero(Cuenta cuentax, double retiro) {

        double saldoF = cuentax.getSaldo();
        if (saldoF < retiro) {
            saldoF = 0;
        } else {
            saldoF -= retiro;
        }
        cuentax.setSaldo((int) saldoF);
    }

//    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%. 
    public void extraccionRapida(Cuenta cuentax, double retiro) {

        double saldoF = cuentax.getSaldo();
        if (retiro > (saldoF * 0.2)) {
            System.out.println("no puede retirar tanto dinero, solo seran retirados " + (saldoF * 0.2));
            saldoF -= (saldoF * 0.2);
        } else {
            saldoF -= retiro;
        }
        cuentax.setSaldo((int) saldoF);
    }

//    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
    public void consultarSaldo(Cuenta cuentax) {
        System.out.println("Tiene " + cuentax.getSaldo() + " de saldo en su cuenta");
    }

//    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
    public void consultarDatos(Cuenta cuentax) {
        System.out.println("Numero de Cuenta = " + cuentax.getNumeroCuenta() + "\nDNI del Cliente = " + cuentax.getDniCliente() + "\nSaldo en cuenta = " + cuentax.getSaldo());
    }

}
