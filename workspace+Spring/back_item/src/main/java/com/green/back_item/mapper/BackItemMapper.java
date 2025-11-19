package com.green.back_item.mapper;

import com.green.back_item.dto.BackItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// mapper 어노테이션을 등록해준다.
@Mapper
public interface BackItemMapper {

  // 상품목록 페이지 (조회)
  public List<BackItemDTO> getBackItemList();

  // 상세정보 페이지 (조회)
  public BackItemDTO getBackItemDetail(int itemNum);

  // 상세정보 페이지 (삭제)
  public void deleteItem(int itemNum);

  // 상품등록 페이지 (등록)
  public void insertItem(BackItemDTO backItemDTO);

  // 상품등록 페이지 (수정)
  public void updateItem(BackItemDTO backItemDTO);

}
