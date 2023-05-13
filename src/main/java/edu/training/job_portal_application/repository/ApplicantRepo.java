package edu.training.job_portal_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.training.job_portal_application.entity.Applicant;

public interface ApplicantRepo extends JpaRepository<Applicant, Integer>{

}
