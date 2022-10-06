package com.ejs789;

/*
 * Consigna del ejercicio:
 * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su 
 * llamante del tipo ArithmeticException que será capturada por su llamante (desde "main",
 * por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
 * Finalmente, mostraremos en cualquier caso: "Demo de código".
 */

public class p7 {

    // Creo la funcion
    static int DividePorCero(int numero) throws ArithmeticException {
        
        int resultado = 0;
        
        try{
            resultado = numero / 0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

        return resultado;
    }

    public static void main(String[] args) throws Exception {
    
        // Debo invocar la funcion dentro de un try-catch porque puede arrojar una excepcion
        try{
            DividePorCero(5);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de mi codigo");
        }
   
    }
}