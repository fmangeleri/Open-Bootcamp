package com.javaBasico;

public class SmartDevice {
    protected String tipoDeDispositivo;
    protected String marca;
    protected String modelo;
    protected String pantalla;

    public SmartDevice(){
    }

    public SmartDevice(String tipoDeDispositivo, String marca, String modelo, String pantalla){
        this.tipoDeDispositivo = tipoDeDispositivo;
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
    }

}
