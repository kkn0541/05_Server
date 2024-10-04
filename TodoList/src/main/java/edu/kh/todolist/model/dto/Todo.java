package edu.kh.todolist.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter setter tostring 
@NoArgsConstructor
@AllArgsConstructor

public class Todo implements Serializable {
								//직렬화
private String title; //제목
private String detail; //상세내용
//+안료여부 
//+등록날짜

}
