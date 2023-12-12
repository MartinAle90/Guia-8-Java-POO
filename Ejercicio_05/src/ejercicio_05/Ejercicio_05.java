/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_05;

import Entidad.Cuenta;
import Servicio.ServicioCuenta;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here}

        ServicioCuenta sc = new ServicioCuenta();
//        Cuenta cuenta01 = new Cuenta();

        Cuenta cuenta01 = sc.crearCuenta();

        System.out.println("Cuanto dinero desea ingresar a su cuenta?");
        double ingreso = entrada.nextDouble();
        sc.ingresarDinero(cuenta01, ingreso);
        sc.consultarSaldo(cuenta01);
        System.out.println("Cuanto dinero desea retirar de su cuenta?");
        double retiro = entrada.nextDouble();
        sc.retirarDinero(cuenta01, retiro);
        sc.consultarSaldo(cuenta01);
        System.out.println("Cuanto dinero desea extraer de forma rapida de su cuenta?");
        double retiroEx = entrada.nextDouble();
        sc.extraccionRapida(cuenta01, retiroEx);
        sc.consultarSaldo(cuenta01);

        sc.consultarDatos(cuenta01);

    }

}
