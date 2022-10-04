package com.javaBasico;

public class ej3 {
    public static void main(String[] args) throws Exception {
        
        String[] palabras = {"esto", "es", "un", "texto", "concatenado"};
        String textoConcatenado = "Hola, ";

        int i = 1;

        for(String palabra : palabras) {
            
            // Agrego la palabra del array a la cadena
            textoConcatenado = textoConcatenado.concat(palabra);
            

            // If para agregar un espacio entre palabras
            if (i < palabras.length) {
                textoConcatenado = textoConcatenado.concat(" ");
            } else {
                textoConcatenado = textoConcatenado.concat(".");
                break;
            }
            
            i++;

        }
        
        System.out.println(textoConcatenado);

    }
}
