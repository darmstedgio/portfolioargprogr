package com.portfolio.portargprogr.model;

import javax.persistence.Column;
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
@Table(name="studies")
public class Study {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String institution;
  private String start_activity;
  private String end_activity;
  private boolean keep_going;
  private String icon_class = "fa-solid fa-laptop-code text-bg-white fa-4x pl-3";
  @Column(columnDefinition = "TEXT")
  private String description;
  private String created_at;
  private String updated_at;


}
