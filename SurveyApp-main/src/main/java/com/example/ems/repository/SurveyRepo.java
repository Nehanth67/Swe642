package com.example.ems.repository;

import com.example.ems.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository

public interface SurveyRepo extends JpaRepository<Survey, Integer> {
}
