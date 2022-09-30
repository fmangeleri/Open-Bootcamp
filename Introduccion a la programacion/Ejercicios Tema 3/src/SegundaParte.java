public class SegundaParte {

    public static void main(String[] args) throws Exception {  
    
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }
}

class Coche{
    public int puertas = 4;

    public void AgregarPuerta(){
        this.puertas++;
    }
}