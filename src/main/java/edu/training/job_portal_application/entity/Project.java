package edu.training.job_portal_application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Project {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long projectId;
   private String projectTital;
   private String projectDescription;
   private String projectSiteURL;
   
   
}
