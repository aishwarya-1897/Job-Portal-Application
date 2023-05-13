package edu.training.job_portal_application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Applicant {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long applicantId;
  private String applicnatName;
  private String applicantEmail;
  private String applicantPassword;
  private String applicantPhNo;
  
  @OneToMany
  private JobApplication jobApplication;
  
  @OneToOne
  private Resume resume;
}
