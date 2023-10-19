package org.davidpenagos.encuesta_educacion_colombia;
import org.davidpenagos.encuesta_educacion_colombia.domain.service.ImplementacionService;
import org.davidpenagos.encuesta_educacion_colombia.domain.repository.ImplementacionRecord;
public class Main {
    public static void main(String[] args) {
        ImplementacionService implementacionService = new ImplementacionService();
        ImplementacionRecord implementacionRecord = new ImplementacionRecord();
        implementacionService.mostrarMediaEdad(implementacionRecord.datosDeEncuesta());


    }
}
