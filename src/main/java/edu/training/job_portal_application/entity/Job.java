package edu.training.job_portal_application.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Job {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long jobId;
   private String jobTital;
   private String jobDiscription;
   private String jobCompany;
   private String jobSalary;
   private LocalDateTime jobCreateDateTime;
   
   @OneToMany
   private JobApplication jobApplication;
   
   @ManyToOne
   private Employer employer;
   
}
