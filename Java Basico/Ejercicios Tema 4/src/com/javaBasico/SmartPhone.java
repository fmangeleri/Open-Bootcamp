package com.javaBasico;

public class SmartPhone extends SmartDevice{
    
    protected boolean camera;

    public SmartPhone(){
        this.tipoDeDispositivo = "Smart Phone";
    }

    public SmartPhone(String marca, String modelo, String pantalla, boolean camera){
        super(pantalla, marca, modelo, pantalla);
        this.camera = camera;
        this.tipoDeDispositivo = "Smart Phone";
    }
}
