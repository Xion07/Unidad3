package org.davidpenagos.encuesta_educacion_colombia.domain.repository;

import org.davidpenagos.encuesta_educacion_colombia.domain.model.Survey;

import java.util.ArrayList;
import java.util.List;

public class ImplementationRecord implements MethodRecord {
    ArrayList<Survey> survey = new ArrayList<>();
    @Override
    public List<Survey> dataSurvey() {

        List<Survey> listRepondents = List.of(
                new Survey("David",32,'M', "Ingeniero",2,3),
                new Survey("Carolina",25,'F', "Tecnologo",1,2),
                new Survey("Jaime",58,'M', "Tecnologo",3,3),
                new Survey("Sandra",47,'F', "Doctora",3,1),
                new Survey("Sebastian",27,'M', "Ingeniero",1,3),
                new Survey("Sarahi",18,'F', "Estudiante",2,2));

        return listRepondents;
    }
}
