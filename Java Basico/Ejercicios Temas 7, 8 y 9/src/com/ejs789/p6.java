package com.ejs789;

import java.util.ArrayList;

/*
 * Consigna del ejercicio:
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve
 * a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos,
 * siempre y cuando cumplas el primer "for" de relleno.
 */


public class p6 {
    public static void main(String[] args) throws Exception {
    
        // Creo la lista
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Bucle for para agregar valores
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // Bucle for para eliminar numeros pares
        for (int i = 9; i >= 0; i--) {
            if(numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }
    
        // Imprimo los valores de la lista final
        System.out.println("Los valores del ArrayList son:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
