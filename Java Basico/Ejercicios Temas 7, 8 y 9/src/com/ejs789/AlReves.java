package com.ejs789;

/*
 * Consigna del ejercicio:
 * Escribe el código que devuelva una cadena al revés.
 * Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 */

public class AlReves {
    
    static String reverse(String texto) {

        String textoAlReves = "";

        for (int i = 0; i < texto.length(); i++) {
            textoAlReves = texto.charAt(i) + textoAlReves;
        }
        return textoAlReves;
    }


    public static void main(String[] args) throws Exception {
        System.out.println(reverse("hola mundo"));
    }
}
