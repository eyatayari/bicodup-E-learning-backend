package com.jra.pma.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jra.pma.models.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
