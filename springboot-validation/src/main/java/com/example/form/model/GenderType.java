package com.example.form.model;

import lombok.Getter;

/*
 * enum(열거형) : 상수들의 집합
 * 
 * 사용이유
 *  - 코드가 단순해진다.
 *  - 구현 의도가 열거형임을 분명히 할 수 있다
 *  
 * 특징
 *  - 선언된 순서에 따라서 0부터 인덱스 값을 가진다
 *  - 모두 대문자로 선언한다
 *  
 * 주요 메소드
 *  - valueOf(String args) : String 값을 enum에서 가져온다. 없으면 예외가 발생한다
 *  - values() : enum의 요소들을 순서대로 enum 타입의 배열로 리턴
 *  - name() : 호출된 값의 이름을 String 타입으로 리턴
 *  - ordinal() : enum에 정의된 값의 순서를 리턴
 *  
 */

@Getter
public enum GenderType {
	MALE("남자"),
	FEMAIL("여자");
	
	private String description;
	
	private GenderType(String description) {
		this.description = description;
	}
}



















