package com.green.car_info_backend.car.dto;

import lombok.Data;

@Data
public class CarDTO {
  private int modelNum;
  private String modelName;
  private int modelPrice;
  private String madeCompany;
}
