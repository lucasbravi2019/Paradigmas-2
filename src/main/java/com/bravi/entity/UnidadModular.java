package com.bravi.entity;

public class UnidadModular {

    private Integer cantidadCircuitos;

    public UnidadModular(Integer cantidadCircuitos) {
        this.cantidadCircuitos = cantidadCircuitos;
    }

    public Integer getCantidadCircuitos() {
        return cantidadCircuitos;
    }

    public void setCantidadCircuitos(Integer cantidadCircuitos) {
        this.cantidadCircuitos = cantidadCircuitos;
    }

    @Override
    public String toString() {
        return "UnidadModular{" +
                "cantidadCircuitos=" + cantidadCircuitos +
                '}';
    }
}
