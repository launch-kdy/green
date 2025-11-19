package com.green.car_info_backend.sales.dto;

import com.green.car_info_backend.car.dto.CarDTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SaleDTO {
  private int sellNum;
  private String cusName;
  private String cusPhone;
  private String color;
  private LocalDateTime sellDate;
  private int modelNum;

  // 차량 정보
  private CarDTO carDTO;
}
