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

//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//String) y su longitud. 

public class Cadena {
    
    private String frase;
    private int fraseLongitud ;

    public Cadena() {
    }

    public Cadena(String frase, int fraseLongitud) {
        this.frase = frase;
        this.fraseLongitud = fraseLongitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getFraseLongitud() {
        return fraseLongitud;
    }

    public void setFraseLongitud(int fraseLongitud) {
        this.fraseLongitud = fraseLongitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", fraseLongitud=" + fraseLongitud + '}';
    }
    
    
    
    
}
