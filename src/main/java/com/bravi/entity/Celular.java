package com.bravi.entity;

public class Celular extends Dispositivo {

    private Boolean encendido = Boolean.FALSE;

    private Bateria bateria;

    private UnidadModular unidadModular;

    public Celular(Integer numeroSerie, UnidadModular unidadModular) {
        super(numeroSerie);
        this.unidadModular = unidadModular;
    }

    public Celular(Integer numeroSerie, Boolean encendido, Bateria bateria, UnidadModular unidadModular) {
        super(numeroSerie);
        if (bateria != null) {
            this.encendido = encendido;
        }
        this.bateria = bateria;
        this.unidadModular = unidadModular;
    }

    public void colocar(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public void encender() {
        if (!Boolean.TRUE.equals(encendido) && this.bateria != null) {
            this.encendido = Boolean.TRUE;
        }
    }

    @Override
    public void apagar() {
        if (!Boolean.FALSE.equals(encendido) && this.bateria != null) {
            this.encendido = Boolean.FALSE;
        }

    }

    @Override
    public void mostrarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Celular{" +
                "encendido=" + encendido +
                ", bateria=" + bateria +
                ", unidadModular=" + unidadModular +
                '}';
    }
}
