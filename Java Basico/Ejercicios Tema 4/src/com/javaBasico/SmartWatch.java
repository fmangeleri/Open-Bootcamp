package com.javaBasico;

public class SmartWatch extends SmartDevice{
    
    protected boolean bluetooth;

    public SmartWatch(){
        this.tipoDeDispositivo = "Smart Watch";
    }

    public SmartWatch(String marca, String modelo, String pantalla, boolean bluetooth) {
        super(pantalla, marca, modelo, pantalla);
        this.bluetooth = bluetooth;
        this.tipoDeDispositivo = "Smart Watch";
    }
}
