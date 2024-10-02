package edu.kh.jsp2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok.jar 라이브러리 이용 방법
//1) lombok기능을 이용하고 자 하는 프로젝트의 lib폴더에 lombok.jar 추가 
//2) lombok을 이용하느 IDE 설치해주기 

@Data //Getter+ Setter+ tostring 
//@Getter
//@Setter
//@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드 초기화용 매개변수 생성자 
public class Book {

	//필드
	private String title;
	private String writer;
	private int price;
	// 메서드( 생성자 , get set tostring
	
}
