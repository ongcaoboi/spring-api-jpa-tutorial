package com.example.demospring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demospring.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>{
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByDescriptionContaining(String description);
}
