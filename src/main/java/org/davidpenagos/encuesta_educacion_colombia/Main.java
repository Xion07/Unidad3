package org.davidpenagos.encuesta_educacion_colombia;
import org.davidpenagos.encuesta_educacion_colombia.domain.service.ImplementationService;
import org.davidpenagos.encuesta_educacion_colombia.domain.repository.ImplementationRecord;

public class Main {
    public static void main(String[] args) {
        ImplementationService implementationService = new ImplementationService();
        ImplementationRecord implementationRecord = new ImplementationRecord();
        implementationService.showAverageAge(implementationRecord.dataSurvey());


    }
}
