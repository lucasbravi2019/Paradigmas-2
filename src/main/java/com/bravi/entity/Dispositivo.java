package com.bravi.entity;

public abstract class Dispositivo {

    private Integer numeroSerie;

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public Dispositivo(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setNumeroSerie(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public abstract void encender();

    public abstract void apagar();

    public abstract void mostrarInfo();

    @Override
    public String toString() {
        return "Dispositivo{" +
                "numeroSerie=" + numeroSerie +
                '}';
    }
}
