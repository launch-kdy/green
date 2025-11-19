package com.green.to_do;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * Todo 관련 데이터베이스 작업을 처리하는 MyBatis Mapper 인터페이스
 * 이 인터페이스의 메서드들은 todo-mapper.xml 파일의 쿼리와 매핑됩니다
 */
@Mapper
public interface TodoMapper {
  /**
   * 모든 할 일 목록을 조회하는 메서드
   * @return 데이터베이스에 저장된 모든 할 일 리스트
   */
  public List<TodoDTO> getTodoList();

  /**
   * 새로운 할 일을 데이터베이스에 추가하는 메서드
   * @param todoTitle 등록할 할 일의 제목
   */
  public void addTodo(String todoTitle);

  /**
   * 특정 할 일을 데이터베이스에서 삭제하는 메서드
   * @param todoNum 삭제할 할 일의 고유 번호 (TODO 테이블의 Primary Key)
   */
  public void deleteTodo(int todoNum);

  public void updateTodo(TodoDTO todoNum);
}
