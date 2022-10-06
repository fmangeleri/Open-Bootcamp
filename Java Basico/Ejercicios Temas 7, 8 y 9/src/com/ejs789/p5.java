package com.ejs789;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Consigna del ejercicio:
 * Crea un ArrayList de tipo String, con 4 elementos.
 * Cópialo en una LinkedList. Recorre ambos mostrando únicamente
 * el valor de cada elemento.
 */


public class p5 {
    public static void main(String[] args) throws Exception {
    
        // Creo el ArrayList y agrego sus valores
        ArrayList<String> cardinales = new ArrayList<String>();

        cardinales.add("Norte");
        cardinales.add("Sur");
        cardinales.add("Este");
        cardinales.add("Oeste");

        // Creo la LinkedList
        LinkedList<String> cardinalesLL = new LinkedList<String>(cardinales);
        
        // Recorro los elementos del ArrayList
        System.out.println("Valores del arrayList:");
        for (String punto : cardinales) {
            System.out.println(punto);
        }

        // Recorro los elementos de la LinkedList
        System.out.println("\nValores de la linkedList:");
        for (String punto : cardinalesLL) {
            System.out.println(punto);
        }
    
    }
}
