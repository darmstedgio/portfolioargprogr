package com.portfolio.portargprogr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;
import lombok.Getter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="projects")
public class Project {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String start_activity;
  private String end_activity;
  private boolean keep_going;
  private String icon_class = "text-bg-white fa-4x pl-3 fa-solid fa-screwdriver-wrench";
  private String description;
  private String created_at;
  private String updated_at;

  
}



