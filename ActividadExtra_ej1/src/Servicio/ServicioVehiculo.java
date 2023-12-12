/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioVehiculo {

    Scanner entrada = new Scanner(System.in);

    public Vehiculo crearVehiculo() {

        Vehiculo veh = new Vehiculo();

        System.out.println("Ingrese la marca del vehiculo");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo de vehiculo");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el año del vehiculo");
        int anio = entrada.nextInt();
        entrada.nextLine();
        do {
            System.out.println("Ingrese el tipo de vehiculo(automovil, motocicleta o bicicleta");
            String tipo = entrada.nextLine();
            veh.setTipo(tipo);
        } while (!"automovil".equals(veh.getTipo()) && !"motocicleta".equals(veh.getTipo()) && !"bicicleta".equals(veh.getTipo()));
        veh.setMarca(marca);
        veh.setModelo(modelo);
        veh.setAnio(anio);

        return veh;
    }

    public int moverse(Vehiculo veh, int segundo) {

        String tipo = veh.getTipo();
        tipo = tipo.toLowerCase();
        int distancia;
        distancia = 0;
        switch (tipo) {
            case "automovil":
                distancia = 3 * segundo;
                break;
            case "motocicleta":
                distancia = 2 * segundo;
                break;
            case "bicicleta":
                distancia = 1 * segundo;
                break;
        }
        return distancia;

    }

    public int frenar(Vehiculo veh, int distancia) {
        if ("bicicleta".equals(veh.getTipo())) {
            distancia += 0;
        } else {
            distancia += 2;
        }
        return distancia;
    }

}
