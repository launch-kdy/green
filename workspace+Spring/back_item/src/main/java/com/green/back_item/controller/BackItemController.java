package com.green.back_item.controller;

import com.green.back_item.dto.BackItemDTO;
import com.green.back_item.service.BackItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backItems")
public class BackItemController {
  private BackItemService backItemService;

  public BackItemController(BackItemService backItemService) {
    this.backItemService = backItemService;
  }

  // 상품목록 페이지 (조회) API
  @GetMapping("")
  public List<BackItemDTO> getBackItemList() {
    return backItemService.getBackItemList();
  }

  // 상세정보 페이지 (조회) API
  @GetMapping("/{itemNum}")
  public BackItemDTO getBackItemDetail(@PathVariable("itemNum") int itemNum) {
    return backItemService.getBackItemDetail(itemNum);
  }

  // 상세정보 페이지 (삭제) API
  @DeleteMapping("/{itemNum}")
  public void deleteItem(@PathVariable("itemNum") int itemNum){
    backItemService.deleteItem(itemNum);
  }

  // 상품등록 페이지 (등록)
  @PostMapping("")
  public void regItem(@RequestBody BackItemDTO backItemDTO){
    System.out.println(backItemDTO);
    backItemService.insertItem(backItemDTO);
  }

  // 상품등록 페이지 (수정)
  @PutMapping("/{itemNum}")
  public void updateItem(@PathVariable("itemNum") int itemNum, @RequestBody BackItemDTO backItemDTO){
    backItemService.updateItem(backItemDTO);
  }


}
