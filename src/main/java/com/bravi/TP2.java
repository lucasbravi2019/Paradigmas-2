package com.bravi;

import com.bravi.entity.Bateria;
import com.bravi.entity.Celular;
import com.bravi.entity.Dispositivo;
import com.bravi.entity.UnidadModular;

public class TP2 {

    public static void main(String[] args) {
        Bateria bateria = new Bateria(2d, 12d, "Bateria");
        UnidadModular unidadModular = new UnidadModular(64);
        Dispositivo dispositivo = new Celular(123, Boolean.FALSE, bateria, unidadModular);

        dispositivo.mostrarInfo();
        dispositivo.encender();
        dispositivo.mostrarInfo();
        dispositivo.apagar();
        dispositivo.mostrarInfo();

        Dispositivo dispositivoSinBateria = new Celular(124, unidadModular);

        dispositivoSinBateria.mostrarInfo();
        dispositivoSinBateria.encender();
        dispositivoSinBateria.mostrarInfo();
        dispositivoSinBateria.apagar();
        dispositivoSinBateria.mostrarInfo();
    }

}
