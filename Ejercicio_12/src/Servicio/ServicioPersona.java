/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioPersona {
    
        static Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona();

            
    public void crearPersona(Persona persona){
        
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("ingrese su dia de nacimiento");
        int diaNacimiento = entrada.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mesNacimiento = entrada.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        int anioNacimiento = entrada.nextInt();
        Date fechaNacimiento = new Date(anioNacimiento-1900, mesNacimiento-1, diaNacimiento);
        persona.setNombre(nombre);
        persona.setFechaNacimiento(fechaNacimiento);
//        return new Persona(nombre, fechaNacimiento);
    }
    
    public int calcularEdad(Persona persona){
        
        Date todayDate = new Date();
        long miliSeg = todayDate.getTime() - persona.getFechaNacimiento().getTime();
        miliSeg = (miliSeg/(1000));
        miliSeg = (miliSeg/(60));
        miliSeg = (miliSeg/(60));
        miliSeg = (miliSeg/(24));
        miliSeg = (miliSeg/(365));
        int edad = (int) miliSeg;
        System.out.println("La edad de la persona es: "+edad);
        persona.setEdad(edad);
        return edad;
    }
    
    public boolean menorQue(Persona persona, int nuevaEdad){
        
        boolean flag = false;
        
        if (nuevaEdad < persona.getEdad()) {
            flag = true;
        }
        return flag;
    }
    
}
