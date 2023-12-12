/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra_ej1;

import Entidad.Vehiculo;
import Servicio.ServicioVehiculo;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ActividadExtra_ej1 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int seg;

        ServicioVehiculo sv = new ServicioVehiculo();
        Vehiculo v1 = sv.crearVehiculo();
        Vehiculo v2 = sv.crearVehiculo();
        Vehiculo v3 = sv.crearVehiculo();

        System.out.println(v1.getTipo() + " en " + 5 + " segundos avanzara " + sv.moverse(v1, 5) + " metros");
        System.out.println(v1.getTipo() + " en " + 10 + " segundos avanzara " + sv.moverse(v1, 10) + " metros");
        System.out.println(v1.getTipo() + " en " + 1 + " minuto avanzara " + sv.moverse(v1, 60) + " metros");
        System.out.println("");
        System.out.println(v2.getTipo() + " en " + 5 + " segundos avanzara " + sv.moverse(v2, 5) + " metros");
        System.out.println(v2.getTipo() + " en " + 10 + " segundos avanzara " + sv.moverse(v2, 10) + " metros");
        System.out.println(v2.getTipo() + " en " + 1 + " minuto avanzara " + sv.moverse(v2, 60) + " metros");
        System.out.println("");
        System.out.println(v3.getTipo() + " en " + 5 + " segundos avanzara " + sv.moverse(v3, 5) + " metros");
        System.out.println(v3.getTipo() + " en " + 10 + " segundos avanzara " + sv.moverse(v3, 10) + " metros");
        System.out.println(v3.getTipo() + " en " + 1 + " minuto avanzara " + sv.moverse(v3, 60) + " metros");
        System.out.println("");

        int distF1 = sv.frenar(v1, sv.moverse(v1, 5 * 60));
        int distF2 = sv.frenar(v2, sv.moverse(v2, 5 * 60));
        int distF3 = sv.frenar(v3, sv.moverse(v3, 5 * 60));

        if (distF1 > distF2) {
            if (distF1 > distF3) {
                System.out.println("El vehículo que logró llegar más lejos luego de frenar fue " + v1.getTipo() + " y avanzo en total " + distF1 + " metros");
            } else if (distF3 > distF2) {
                System.out.println("El vehículo que logró llegar más lejos luego de frenar fue " + v3.getTipo() + " y avanzo en total " + distF3 + " metros");
            } else {
                System.out.println("El vehículo que logró llegar más lejos luego de frenar fue " + v2.getTipo() + " y avanzo en total " + distF2 + " metros");
            }
        }

    }

}
