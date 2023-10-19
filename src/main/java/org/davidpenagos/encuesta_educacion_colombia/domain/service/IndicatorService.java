package org.davidpenagos.encuesta_educacion_colombia.domain.service;

import org.davidpenagos.encuesta_educacion_colombia.domain.model.Encuesta;

import javax.swing.*;
import java.util.List;

public interface IndicatorService {
    void mostrarMediaEdad(List<Encuesta> encuestaDatos);

    void mostrarConteoGenero(List<Encuesta> encuestaDatos);

    void mostrarFrecuenciaProfesiones(List<Encuesta> encuestaDatos);

    void mostrarResultadosPregunta1(List<Encuesta> encuestaDatos);

    void mostrarResultadosPregunta2(List<Encuesta> encuestaDatos);
}
