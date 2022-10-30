package com.portfolio.portargprogr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Null;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Tecnology {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;

  private String name;
  private int level;
  private String icon_class = "fa-solid fa-laptop-code text-bg-white fa-4x pl-3";
  private String description;
  private String created_at;
  private String updated_at;

}
