package edu.training.job_portal_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.training.job_portal_application.entity.Resume;

public interface ResumeRepo extends JpaRepository<Resume, Integer>{

}
