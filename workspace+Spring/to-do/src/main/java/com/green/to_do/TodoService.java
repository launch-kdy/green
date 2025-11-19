package com.green.to_do;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
  public final TodoMapper todoMapper;

  public List<TodoDTO> getTodoList(){
    return todoMapper.getTodoList();
  }

  /**
   * 새로운 할 일을 등록하는 메서드
   * @param todoTitle 등록할 할 일의 제목
   */
  public void addTodo(String todoTitle){
    todoMapper.addTodo(todoTitle);
  }

  /**
   * 특정 할 일을 삭제하는 메서드
   * @param todoNum 삭제할 할 일의 고유 번호 (Primary Key)
   * @throws Exception 데이터베이스 삭제 작업 중 오류 발생 시
   */
  public void deleteTodo(int todoNum){
    // MyBatis Mapper를 통해 데이터베이스에서 해당 할 일 삭제
    todoMapper.deleteTodo(todoNum);
  }

  public void updateTodo(TodoDTO todoNum){
    todoMapper.updateTodo(todoNum);
  }

}











