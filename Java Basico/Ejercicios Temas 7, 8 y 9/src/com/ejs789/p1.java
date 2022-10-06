package com.ejs789;

/*
 * Consigna del ejercicio:
 * Crea un array unidimensional de Strings y recórrelo,
 * mostrando únicamente sus valores.
 */


public class p1 {
    public static void main(String[] args) throws Exception {
        
        // Creo el array
        String[] nombres = {"Carlos", "Jose", "Martina", "Sofia"};

        // Lo recorro e imprimo su valor en cada posicion
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}
