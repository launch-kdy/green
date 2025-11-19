package com.green.restful.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpDTO {
  private String name;
  private String job;
  private int sal;

  @Override
  public String toString() {
    return "EmpDTO{" +
            "name='" + name + '\'' +
            ", job='" + job + '\'' +
            ", sal=" + sal +
            '}';
  }
}
