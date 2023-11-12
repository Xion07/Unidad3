package org.davidpenagos.encuesta_educacion_colombia.domain.service;

import org.davidpenagos.encuesta_educacion_colombia.domain.model.Survey;
import org.davidpenagos.encuesta_educacion_colombia.domain.repository.ImplementationRecord;

import java.util.List;
import java.util.stream.Collectors;

public class ImplementationService implements IndicatorService {
    ImplementationRecord dataImportedSurvey = new ImplementationRecord();
    List<Survey> dataSurvey = dataImportedSurvey.dataSurvey();

    @Override
    public void showAverageAge(List<Survey> surveyData) {
        int sumOfAgesSurveyed = 0;
        for (Survey e : dataSurvey) {
            sumOfAgesSurveyed += e.age();
        }
        double averageAge = (double) sumOfAgesSurveyed / dataSurvey.size();

        System.out.println("The average age is: " + averageAge);
    }

    @Override
    public void showGenderCount(List<Survey> surveyDatoes) {
        long women = 0;
        long men = 0;
        System.out.println("There is " + women + " Women and " + men + " Men");
    }

    @Override
    public void showFrequencyProfessions(List<Survey> surveyDatoes) {
            List<String> profession = surveyDatoes.stream()
                    .map(Survey::profession)
                    .collect(Collectors.toList());

        }

    @Override
    public void showResultsQuestionOne(List<Survey> surveyDatos) {

            long good = surveyDatos.stream().filter(survey -> survey.opinionEducations() == 1).count();
            long bad = surveyDatos.stream().filter(survey -> survey.opinionEducations() == 2).count();
            long regular = surveyDatos.stream().filter(survey -> survey.opinionEducations() == 3).count();

            System.out.println("**Results of question one:**");
            System.out.println("| Good | " + good + " |");
            System.out.println("| Bad | " + bad + " |");
            System.out.println("| Regular | " + regular + " |");
        }

    @Override
    public void showResultsQuestionOnetwo(List<Survey> surveyData) {
        long coverage = surveyData.stream().filter(survey -> survey.improvementColombia() == 1).count();
        long institutions = surveyData.stream().filter(survey -> survey.improvementColombia() == 2).count();
        long financing = surveyData.stream().filter(survey -> survey.improvementColombia() == 3).count();

        System.out.println("**Results of question Two:**");
        System.out.println("| Coverage | " + coverage + " |");
        System.out.println("| Institutions | " + institutions + " |");
        System.out.println("| Financing | " + financing + " |");
    }

}

    /*implementar metodos*/

