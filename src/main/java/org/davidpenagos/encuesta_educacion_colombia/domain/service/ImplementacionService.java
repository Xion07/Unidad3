package org.davidpenagos.encuesta_educacion_colombia.domain.service;

import org.davidpenagos.encuesta_educacion_colombia.domain.repository.ImplementacionRecord;
import org.davidpenagos.encuesta_educacion_colombia.domain.model.Encuesta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementacionService implements IndicatorService {
    ImplementacionRecord datosImportadosEncuesta = new ImplementacionRecord();
    List<Encuesta> datosEncuesta = datosImportadosEncuesta.datosDeEncuesta();

    @Override
    public void mostrarMediaEdad(List<Encuesta> encuestaDatos) {

        int sumaEdadesEncuestados = 0;
        for (Encuesta e : datosEncuesta) {
            sumaEdadesEncuestados += e.edad();
        }
        double mediaEdad = (double) sumaEdadesEncuestados / datosEncuesta.size();

        System.out.println("La media de las edades es: " + mediaEdad);
    }

    @Override
    public void mostrarConteoGenero(List<Encuesta> encuestaDatos) {
        long mujeres = encuestaDatos.stream().filter(encuesta -> encuesta.genero() == 'F').count();
        long hombres = encuestaDatos.stream().filter(encuesta -> encuesta.genero() == 'M').count();
        System.out.println("Hay " + mujeres + " mujeres y " + hombres + " hombres");
    }

    @Override
    public void mostrarFrecuenciaProfesiones(List<Encuesta> encuestaDatos) {
            List<String> profesiones = encuestaDatos.stream()
                    .map(Encuesta::profesion)
                    .collect(Collectors.toList());

        }

    @Override
    public void mostrarResultadosPregunta1(List<Encuesta> encuestaDatos) {

            long buena = encuestaDatos.stream().filter(encuesta -> encuesta.opinionEducacion() == 1).count();
            long mala = encuestaDatos.stream().filter(encuesta -> encuesta.opinionEducacion() == 2).count();
            long regular = encuestaDatos.stream().filter(encuesta -> encuesta.opinionEducacion() == 3).count();

            System.out.println("**Resultados de la pregunta 1:**");
            System.out.println("| Buena | " + buena + " |");
            System.out.println("| Mala | " + mala + " |");
            System.out.println("| Regular | " + regular + " |");
        }

    @Override
    public void mostrarResultadosPregunta2(List<Encuesta> encuestaDatos) {
        long cobertura = encuestaDatos.stream().filter(encuesta -> encuesta.mejoraColombia() == 1).count();
        long instituciones = encuestaDatos.stream().filter(encuesta -> encuesta.mejoraColombia() == 2).count();
        long financiacion = encuestaDatos.stream().filter(encuesta -> encuesta.mejoraColombia() == 3).count();

        System.out.println("**Resultados de la pregunta 2:**");
        System.out.println("| Cobertura | " + cobertura + " |");
        System.out.println("| Instituciones | " + instituciones + " |");
        System.out.println("| Financiación | " + financiacion + " |");
    }

}

    /*implementar metodos*/

