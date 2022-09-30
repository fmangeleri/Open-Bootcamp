public class ej4 {
    public static void main(String[] args) {

        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("El numero es positivo");  
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }


        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }


        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);


        
        for (int numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println(numeroFor);
        }


        String estacion = "Invierno";

        switch (estacion){
            case "Verano":
                System.out.println("La estacion es verano");
                break;
            case "Invierno":
                System.out.println("La estacion es invierno");
                break;
            case "Primavera":
                System.out.println("La estacion es primavera");
                break;
            case "Otoño":
                System.out.println("La estacion es otoño");
                break;
            default:
                System.out.println("La variable no es una estacion");  
        }

    }
}
