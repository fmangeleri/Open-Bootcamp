package com.ejs789;

/*
 * Consigna del ejercicio:
 * Crea un array bidimensional de enteros y recórrelo,
 * mostrando la posición y 
 * el valor de cada elemento en ambas dimensiones.
 */


public class p2 {
    public static void main(String[] args) throws Exception {
        
        // Creo el array
        int[][] intsBidimensional = { {1, 2},
                                    {3, 4},
                                    {5, 6},
        };

        // Contador para filas
        int i = 0;

        // Bucle Foreach para filas
        for (int[] fila : intsBidimensional) {

            // Contador para comlumnas
            int j = 0;

            // Bucle Foreach elementos dentro de cada columna
            for (int numero : fila) {
                System.out.println("El valor de la fila " + i + ", columna " + j + " es " + numero);
                j++;
            }
            i++;
        }
    }
}
