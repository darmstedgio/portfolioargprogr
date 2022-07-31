package com.portfolio.portargprogr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;

  private String email;
  private String password;
  private String role;
  private String image_path;
  private String updated_at;
  private String created_at;

  
  @OneToMany(targetEntity = Identity.class, cascade = CascadeType.ALL)
  @JoinColumn(name="user_id", referencedColumnName = "id")
  private List<Identity> identities;

  @OneToMany(targetEntity = Tecnology.class, cascade = CascadeType.ALL)
  @JoinColumn(name="user_id", referencedColumnName = "id")
  private List<Tecnology> tecnologies;

  @OneToMany(targetEntity = Project.class, cascade = CascadeType.ALL)
  @JoinColumn(name="user_id", referencedColumnName = "id")
  private List<Project> projects;

  @OneToMany(targetEntity = Study.class, cascade = CascadeType.ALL)
  @JoinColumn(name="user_id", referencedColumnName = "id")
  private List<Study> studies;

  @OneToMany(targetEntity = LaboralExperience.class, cascade = CascadeType.ALL)
  @JoinColumn(name="user_id", referencedColumnName = "id")
  private List<LaboralExperience> laboralexperiences;

}
 