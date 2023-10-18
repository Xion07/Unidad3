package org.davidpenagos.encuesta_educacion_colombia;

public class Main {
    public static void main(String[] args) {
        Encuesta[] datosEncuesta = Encuesta.recogerDatos();
        Estadisticas.mostrarEstadisticas(datosEncuesta);
    }
}
