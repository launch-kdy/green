package com.green.back_item.service;

import com.green.back_item.dto.BackItemDTO;
import com.green.back_item.mapper.BackItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Mapper와 동일하게 Service 어노테이션
@Service
public class BackItemService {

  // (BackItemMapper와 연동을 위해) 객체를 생성해준다
  private BackItemMapper backItemMapper;
  // (생성자)까지 생성해준다
  @Autowired
  public BackItemService(BackItemMapper backItemMapper) {
    this.backItemMapper = backItemMapper;
  }

  // 상품목록 페이지 (조회)
  public List<BackItemDTO> getBackItemList() {
    return backItemMapper.getBackItemList();
  }

  // 상세정보 페이지 (조회)
  public BackItemDTO getBackItemDetail(int itemNum) {
    return backItemMapper.getBackItemDetail(itemNum);
  }

  // 상세정보 페이지 (삭제)
  public void deleteItem(int itemNum){
    backItemMapper.deleteItem(itemNum);
  }

  // 상품등록 페이지 (등록)
  public void insertItem(BackItemDTO backItemDTO){
    backItemMapper.insertItem(backItemDTO);
  }

  // 상품등록 페이지 (수정)
  public void updateItem(BackItemDTO backItemDTO) {backItemMapper.updateItem(backItemDTO);}

}
