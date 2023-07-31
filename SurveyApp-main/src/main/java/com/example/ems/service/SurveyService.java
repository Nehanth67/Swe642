package com.example.ems.service;

import com.example.ems.entity.Survey;
import com.example.ems.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepo repository;

    //post
    public Survey saveSurvey(Survey survey) {
        return repository.save(survey);
    }

    public List<Survey> saveSurvey(List<Survey> survey) {
        return repository.saveAll(survey);
    }

    //get
    public List<Survey> getSurvey() {
        return repository.findAll();
    }

    public Optional<Survey> getSurveybyId(int id) {
        return repository.findById(id);
    }

    //delete
    public String deleteSurvey(int sid) {
        repository.deleteById(sid);
        return "id deleted";
    }

    // update
    public Survey updateSurvey(Survey survey) {
        Survey existingSurvey = repository.findById(survey.getSid()).orElse(null);

        existingSurvey.setFname(survey.getFname());
        existingSurvey.setLname(survey.getLname());
        existingSurvey.setCity(survey.getCity());

        return repository.save(existingSurvey);
    }

}

