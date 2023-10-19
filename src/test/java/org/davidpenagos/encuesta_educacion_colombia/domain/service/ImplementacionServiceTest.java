package org.davidpenagos.encuesta_educacion_colombia.domain.service;
//package org.davidpenagos.encuesta_educacion_colombia.domain.model.Encuesta;


import org.davidpenagos.encuesta_educacion_colombia.domain.model.Encuesta;
import org.davidpenagos.encuesta_educacion_colombia.domain.repository.MetodoRecord;
import org.davidpenagos.encuesta_educacion_colombia.infra.repository.MetodoRecordImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImplementacionServiceTest {
    private ImplementacionService implementacionService =
            new ImplementacionService(new MetodoRecordImpl());
    

    @Test
    void el_valor_de_la_MediaEdad_funciona_correctamente() {
       // List<Encuesta> mediaEdadLists = implementacionService.mostrarMediaEdad();
       // assertNotNull(mediaEdadLists);

    }

    @Test
   public void el_valor_del_ConteoGenero_funciona_correctamente() {
       // implementacionService.mostrarConteoGenero();
       // List<Encuesta> conteoGeneroList = implementacionService.mostrarConteoGenero();
       // assertNotNull(conteoGeneroList);
    }

    @Test
    void la_FrecuenciaProfesiones_funciona_correctamente() {
    }

    @Test
    void los_resultados_de_la_Pregunta1_funciona_correctamente() {
    }

    @Test
    void los_resultados_de_la_Pregunta2_funciona_correctamente() {
    }
}