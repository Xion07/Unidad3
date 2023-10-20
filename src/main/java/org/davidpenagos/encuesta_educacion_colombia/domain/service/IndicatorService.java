package org.davidpenagos.encuesta_educacion_colombia.domain.service;

import org.davidpenagos.encuesta_educacion_colombia.domain.model.Survey;

import java.util.List;

public interface IndicatorService {
    void showAverageAge(List<Survey> surveyData);

    void showGenderCount(List<Survey> surveyData);

    void showFrequencyProfessions(List<Survey> surveyData);

    void showResultsQuestionOne(List<Survey> surveyData);

    void showResultsQuestionOnetwo(List<Survey> surveyData);
}
