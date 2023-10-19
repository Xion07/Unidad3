package org.davidpenagos.encuesta_educacion_colombia.domain.repository;

import org.davidpenagos.encuesta_educacion_colombia.domain.model.Encuesta;

import java.util.List;

public interface MetodoRecord {
    List<Encuesta> datosDeEncuesta();
}
