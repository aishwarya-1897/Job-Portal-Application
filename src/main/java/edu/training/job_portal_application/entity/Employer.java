package edu.training.job_portal_application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employerId;
    private String employerName;
    private String employerEmail;
    private String employerPassword;
    
    @OneToMany
    private Job job;
}
