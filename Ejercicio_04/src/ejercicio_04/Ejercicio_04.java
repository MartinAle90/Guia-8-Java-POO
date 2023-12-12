/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_04;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

/**
 *
 * @author Martin
 */
//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
//con los datos del Rectángulo dados por el usuario. También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2. 
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo rect = sr.crearRectangulo();
        System.out.println("El rectangulo de base " + rect.getBase() + " y altura " + rect.getAltura() + " tiene una superficie de: " + sr.calcularSuperficie(rect));
        System.out.println("El rectangulo de base " + rect.getBase() + " y altura " + rect.getAltura() + " tiene un perimetro de: " + sr.calcularPerimetro(rect));

        sr.dibujarRectangulo(rect);
    }

}
