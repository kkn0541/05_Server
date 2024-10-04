package edu.kh.todolist.model.service;

import java.util.List;

import edu.kh.todolist.model.dto.Todo;

public interface TodoListService {

	
	//추상메서드
	//publicc abstaract 를 명시하지 않아도 public abstract 으로 해석됨
	
	 
	
	/** 할일 목록 반환 서비스 
	 * @return todoList
	 */
	/*public abstract */ List<Todo> todoListFullView();

	/**전달 받은 title과 detail 이용하여 할일 추가 서비스 
	 * @param title
	 * @param detail
	 * @return 추가된 index 번호 or -1반환 
	 */
	int todoAdd(String title, String detail) throws Exception;
	

}
