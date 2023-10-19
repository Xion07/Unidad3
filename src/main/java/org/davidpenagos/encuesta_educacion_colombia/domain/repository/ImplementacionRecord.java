package org.davidpenagos.encuesta_educacion_colombia.domain.repository;

import org.davidpenagos.encuesta_educacion_colombia.domain.model.Encuesta;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionRecord implements MetodoRecord{
    ArrayList<Encuesta> encuesta = new ArrayList<>();
    @Override
    public List<Encuesta> datosDeEncuesta() {

        List<Encuesta> listaDeEncuestados = List.of(
                new Encuesta("David",32,'M', "Ingeniero",2,3),
                new Encuesta("Carolina",25,'F', "Tecnologo",1,2),
                new Encuesta("Jaime",58,'M', "Tecnologo",3,3),
                new Encuesta("Sandra",47,'F', "Doctora",3,1),
                new Encuesta("Sebastian",27,'M', "Ingeniero",1,3),
                new Encuesta("Sarahi",18,'F', "Estudiante",2,2));

        return listaDeEncuestados;
    }
}
