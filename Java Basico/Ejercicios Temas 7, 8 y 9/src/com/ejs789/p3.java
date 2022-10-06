package com.ejs789;

import java.util.Vector;

/*
 * Consigna del ejercicio:
 * Crea un "Vector" del tipo de dato que prefieras,
 *  y añádele 5 elementos.
 * Elimina el 2o y 3er elemento y muestra el resultado final.
 */


public class p3 {

    public static void main(String[] args) throws Exception {
    
        // Creo el vector
        Vector<String> colores = new Vector<String>(5);
        
        // Agrego colores al vector
        colores.add("Azul");
        colores.add("Rosa");
        colores.add("Amarillo");
        colores.add("Verde");
        colores.add("Rojo");

        System.out.println(colores);

        // Elimino los valores en las posisciones 2 y 3
        colores.remove(2);
        colores.remove(1);

        System.out.println(colores);
    }
}
