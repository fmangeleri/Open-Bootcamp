package com.ejs789;

import java.util.Vector;

/*
 * Consigna del ejercicio:
 * Indica cuál es el problema de utilizar un Vector 
 * con la capacidad por defecto si tuviésemos 1000 
 * elementos para ser añadidos al mismo.
 */


public class p4 {

    public static void main(String[] args) throws Exception {
    
        Vector<String> vector = new Vector<String>();

        System.out.println(vector.capacity());
        
        /* Como podemos ver, la capacidad de un vector por defecto es de 10 posiciones.
        *  Cuando nos excedemos de la capacidad, el vector aumenta en 10 posiciones,
        *  pero por detras lo que ocurre no es que se agranda el mismo vector, sino que se crea uno nuevo 
        *  haciendo una copia de arrays anteriores, esto tiene un costo computacional enorme por lo que hay
        *  que intentar crear el vector con la capacidad aproximada que estimemos que vamos a utilizar
        */
            
    }
}