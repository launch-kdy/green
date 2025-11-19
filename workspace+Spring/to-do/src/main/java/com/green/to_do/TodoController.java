package com.green.to_do;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todo")
public class TodoController {
  public final TodoService todoService;

  @GetMapping("")
  public ResponseEntity<?> getList(){
    try{
      List<TodoDTO> todoList = todoService.getTodoList();
      return ResponseEntity.status(HttpStatus.OK).body(todoList);
    }catch (Exception e){
      e.printStackTrace();
      return ResponseEntity
              .status(HttpStatus.INTERNAL_SERVER_ERROR)
              .body("할 일 목록 조회 중 오류가 발생했습니다");
    }
  }

  @PostMapping("")
  public ResponseEntity<?> add(@RequestBody TodoDTO dto){
    try{
      //제목으로 빈 문자가 전달됐으면...
      if(dto.getTodoTitle().equals("")){
        //강제로 예외(오류)를 발생시킴
        throw new Exception();
      }

      todoService.addTodo(dto.getTodoTitle());
      return ResponseEntity.status(HttpStatus.CREATED).build();
    } catch (Exception e) {
      e.printStackTrace();

      boolean isParamError = dto.getTodoTitle() == null || dto.getTodoTitle().equals("");

      //1. 앱에서 입력한 할 일 제목이 이상할 경우
      return ResponseEntity
              .status(
                isParamError ? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR
              )
              .body(
                isParamError ?
                "입력한 제목 데이터가 정상적이지 않습니다" :
                "할 일 등록 기능 실행 중 오류가 발생했습니다"
              );
    }
  }

  /**
   * 특정 할 일을 삭제하는 REST API 엔드포인트
   * 
   * HTTP Method: DELETE
   * URL: /todo/{todoNum}
   * 
   * @param todoNum URL 경로에서 전달받는 삭제할 할 일의 고유 번호
   * @return ResponseEntity - 성공 시 200 OK, 실패 시 400 BAD_REQUEST 또는 500 INTERNAL_SERVER_ERROR
   * 
   * 처리 과정:
   * 1. todoNum 유효성 검증 (0 이하인지 체크)
   * 2. 유효하면 Service를 통해 삭제 처리
   * 3. 성공 시 HTTP 200 상태 코드 반환
   * 4. 실패 시 적절한 오류 메시지와 상태 코드 반환
   * 
   * 사용 예시:
   * DELETE http://localhost:8080/todo/5
   * -> TODO_NUM이 5인 할 일을 삭제
   */
  @DeleteMapping("/{todoNum}")
  public ResponseEntity<?> delete(@PathVariable int todoNum){
    try{
      if(todoNum <= 0){
        throw new Exception();
      }

      todoService.deleteTodo(todoNum);

      return ResponseEntity.status(HttpStatus.OK).build();
    } catch (Exception e) {
      e.printStackTrace();

      boolean isParamError = todoNum <= 0;

      return ResponseEntity
              .status(
                isParamError ? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR
              )
              .body(
                isParamError ?
                "전달된 할 일 번호가 정상적이지 않습니다" :
                "할 일 삭제 기능 실행 중 오류가 발생했습니다"
              );
    }
  }

  @PutMapping("/{todoNum}")
  public ResponseEntity update(@PathVariable("todoNum") int todoNum,
                                @RequestBody TodoDTO todoDTO){
    System.out.println(todoNum);
    System.out.println(todoDTO);

    todoDTO.setTodoNum(todoNum);
    todoService.updateTodo(todoDTO);

    return ResponseEntity.status(HttpStatus.OK).build();
  }

}
