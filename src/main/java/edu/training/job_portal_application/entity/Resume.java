package edu.training.job_portal_application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.web.ProjectedPayload;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Resume {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long resumeId;
   private String resumeSummary; 
   private String resumeQualification;
   private String resumeUniversity;
   private String resumeSocialProfile1;
   private String resumeSocialProfile2;
   private String resumeSocialProfile3;
   private String resumeCertification;
   
   @OneToOne
   private Applicant applicant;
   
   @OneToMany
   private Skill skill;
   
   @OneToMany
   private Project project;
   
}
