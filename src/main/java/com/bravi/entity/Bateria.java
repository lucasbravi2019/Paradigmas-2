package com.bravi.entity;

public class Bateria {

    private Double amperaje;

    private Double voltaje;

    private String nombreModelo;

    public Bateria(Double amperaje, Double voltaje, String nombreModelo) {
        this.amperaje = amperaje;
        this.voltaje = voltaje;
        this.nombreModelo = nombreModelo;
    }

    public Double getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(Double amperaje) {
        this.amperaje = amperaje;
    }

    public Double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(Double voltaje) {
        this.voltaje = voltaje;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "amperaje=" + amperaje +
                ", voltaje=" + voltaje +
                ", nombreModelo='" + nombreModelo + '\'' +
                '}';
    }
}
