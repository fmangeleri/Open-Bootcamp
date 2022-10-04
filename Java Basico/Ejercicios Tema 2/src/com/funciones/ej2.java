package com.funciones;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) throws Exception {
        
        // Creo el objeto de scanner
        Scanner scanner = new Scanner(System.in);

        // Pido el precio al usuario
        System.out.println("Ingrese el precio sin IVA:");
        float precioSinIVA = scanner.nextFloat();

        // Cierro el scanner
        scanner.close();

        // Invoco la funciono y la muestro en la consola
        float precioConIVA = sumarIVA(precioSinIVA);
        System.out.println("El precio final con IVA es de " + precioConIVA);


    }

    // Creo la funcion para calcular el IVA
    public static float sumarIVA(float precio) {
        return (precio * 1.21f);
    }

}


