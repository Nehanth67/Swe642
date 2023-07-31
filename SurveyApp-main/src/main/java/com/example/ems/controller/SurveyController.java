package com.example.ems.controller;

import com.example.ems.entity.Survey;
import com.example.ems.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class SurveyController {
    @Autowired
    private SurveyService service;

    @PostMapping("/addsurvey")
    public Survey addSurvey(@RequestBody Survey survey) {
        return service.saveSurvey(survey);
    }

    @PostMapping("/addsurveys")
    public List<Survey> addSurvey(@RequestBody List<Survey> surveys) {
        return service.saveSurvey(surveys);
    }

    @GetMapping("/survey")
    public List<Survey> findAllSurveys() {
        return service.getSurvey();
    }

    @GetMapping("survey/{id}")
    public Optional<Survey> findAllSurveysByid(@PathVariable int id) {
        return service.getSurveybyId(id);
    }

    @PutMapping("/updatesurvey")
    public Survey updateSurvey(@RequestBody Survey survey) {
        return service.updateSurvey(survey);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSurvey(@PathVariable("id") int sid) {
        return service.deleteSurvey(sid);
    }

}
