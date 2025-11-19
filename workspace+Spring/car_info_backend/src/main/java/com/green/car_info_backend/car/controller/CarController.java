package com.green.car_info_backend.car.controller;

import com.green.car_info_backend.car.dto.CarDTO;
import com.green.car_info_backend.car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
  private final CarService carService;

  //차량관리화면(차량목록조회)
  @GetMapping("")
  public List<CarDTO> getCarList() {
    return carService.getCarList();
  }

  //차량관리화면(차량등록)
  @PostMapping("")
  public void insertCar(@RequestBody CarDTO carDTO){
    System.out.println(carDTO);
    carService.insertCar(carDTO);
  }

}
