package com.green.car_info_backend.car.mapper;

import com.green.car_info_backend.car.dto.CarDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {
  //차량관리화면(차량목록조회)
  public List<CarDTO> getCarList();

  //차량관리화면(차량등록)
  public void insertCar(CarDTO carDTO);

}
