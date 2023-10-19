package org.davidpenagos.encuesta_educacion_colombia.infra.repository;

import org.davidpenagos.encuesta_educacion_colombia.domain.model.Encuesta;
import org.davidpenagos.encuesta_educacion_colombia.domain.repository.ImplementacionRecord;
import org.davidpenagos.encuesta_educacion_colombia.domain.repository.MetodoRecord;

import java.util.Collections;
import java.util.List;

public class MetodoRecordImpl implements MetodoRecord {
    @Override
    public List<Encuesta> datosDeEncuesta() {

        Collections collections = null;
        return collections.emptyList();
    }
}
