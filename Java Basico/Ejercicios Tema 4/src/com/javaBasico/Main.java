package com.javaBasico;

public class Main {
    public static void main(String[] args) throws Exception {
        
        SmartPhone miSmartPhone = new SmartPhone("Apple", "IPhone 12", "OLED", true);
        SmartWatch miSmartWatch = new SmartWatch("Apple", "Sreies 8", "OLED", true);

        System.out.println(miSmartPhone.tipoDeDispositivo);
        System.out.println(miSmartPhone.marca);
        System.out.println(miSmartPhone.modelo);
        System.out.println(miSmartPhone.pantalla);
        System.out.println(miSmartPhone.camera);

        System.out.println();
        
        System.out.println(miSmartWatch.tipoDeDispositivo);
        System.out.println(miSmartWatch.marca);
        System.out.println(miSmartWatch.modelo);
        System.out.println(miSmartWatch.pantalla);
        System.out.println(miSmartWatch.bluetooth);

    }
}