/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Martin
 */

public class ServicioCadena {
    
    static Scanner entrada = new Scanner(System.in);
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
    public void mostrarVocales(Cadena cad){
        int contA=0, contE=0, contI=0, contO=0, contU = 0 ;
        for (int i = 0; i < cad.getFraseLongitud(); i++) {
            char letra = cad.getFrase().charAt(i);
            Character.toLowerCase(letra);
            
            switch (letra) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
                default:
                    break;
            }

        }
                    System.out.println("La frase tiene: \n"+
                    contA+ " letras A \n"+
                    contE+ " letras E \n"+
                    contI+ " letras I \n"+
                    contO+ " letras O \n"+
                    contU+ " letras U" );
            System.out.println("La frase tiene "+(contA+contE+contI+contO+contU)+" vocales");
    }
    
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena cad) {

        String fraseInvertida = "";

        for (int i = cad.getFraseLongitud() - 1; i >= 0; i--) {
            fraseInvertida += cad.getFrase().charAt(i);
        }
        System.out.println("Frase original: " + cad.getFrase());
        System.out.println("Frase invertida: " + fraseInvertida);
    }

//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(String caracter, Cadena cad) {

        int contCaracter = 0;
        for (int i = 0; i < cad.getFraseLongitud(); i++) {
            char letra = cad.getFrase().charAt(i);
            if (caracter.charAt(0) == letra) {
                contCaracter++;
            }
        }
        System.out.println("El caracter '" + caracter + "' se repite " + contCaracter + " veces");
    }
    
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena cad, String frase) {

        if (cad.getFraseLongitud() > frase.length()) {
            System.out.println("La longitud de la primera frase es mayor");
        } else if (cad.getFraseLongitud() < frase.length()) {
            System.out.println("La longitud de la segunda frase es mayor");
        } else {
            System.out.println("Las dos frases tienen la misma longitud");
        }
    }

//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena cad, String frase){
        System.out.println(cad.getFrase()+" "+frase);
    }
    
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.    
    public void reemplazar(Cadena cad, String caracter) {
        
    }
    
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no. 
    public boolean contiene(String letra){
        
        boolean bandera = false;
        return bandera;
    }
    
}
