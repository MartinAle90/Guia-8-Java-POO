/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioCurso {
    
    static Scanner entrada = new Scanner(System.in);
    
    public void cargarAlumno(Curso cursoX) {

        String[] alumnos = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("nombre del alumno " + i);
            alumnos[i] = entrada.next();
        }
        System.arraycopy(alumnos, 0, cursoX.getAlumnos(), 0, alumnos.length);
    }
    
    public void mostrarAlumnos(Curso cursoX){

            System.out.println(Arrays.toString(cursoX.getAlumnos()));
          
    }
    
    public Curso crearCurso() {
        
        Curso cursoX = new Curso();

        System.out.println("Nombre del curso");
        String nombreCurso = entrada.nextLine();
        cursoX.setNombreCurso(nombreCurso);

        System.out.println("cantidad de horas por dia");
        int cantidadHorasPorDia = entrada.nextInt();
        cursoX.setCantidadHorasPorDia(cantidadHorasPorDia);

        System.out.println("canitidad de dias por semana");
        int cantidadDiasPorSemana = entrada.nextInt();
        cursoX.setCantidadDiasPorSemana(cantidadDiasPorSemana);

        System.out.println("turno(mañana, tarde, noche)");
        String turno = entrada.nextLine();
        cursoX.setTurno(turno);

        entrada.next();
        System.out.println("precio por hora");
        int precioPorHora = entrada.nextInt();
        cursoX.setPrecioPorHora(precioPorHora);

        cargarAlumno(cursoX);
        
        return cursoX;
    }
    
// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
    
    public void calcularGananciaSemanal(Curso cursoX){
        
        System.out.println("ganancias en una semana por curso");
        System.out.println("$ "+ cursoX.getCantidadHorasPorDia()*cursoX.getCantidadDiasPorSemana()*cursoX.getPrecioPorHora()*5);

    }
    

        
}
