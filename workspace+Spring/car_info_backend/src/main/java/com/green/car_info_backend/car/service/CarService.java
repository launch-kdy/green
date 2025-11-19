package com.green.car_info_backend.car.service;

import com.green.car_info_backend.car.dto.CarDTO;
import com.green.car_info_backend.car.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
  private final CarMapper carMapper;

  //차량관리화면(차량목록조회)
  public List<CarDTO> getCarList() {
    return carMapper.getCarList();
  }

  //차량관리화면(차량등록)
  public void insertCar(CarDTO carDTO) {
    carMapper.insertCar(carDTO);
  }

}
