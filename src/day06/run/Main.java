package day06.run;

import day06.study.FieldTest;
import day06.study.Human;

public class Main {
	
	public static void main(String[] args) {
		// 단순 실행 전용 메소드
		// 객체를 사용하는 방법
		// 1. 기본 생성자를 통해 만드는 방법
		// 클래스명 변수명 (객체의 별칭) = new 클래스명 ();
		//						   ------------- 생성자
		
		Human h1 = new Human();
		System.out.printf("h1 고유 번호 확인 : %s \n", h1);
		h1.name = "홍길동";
		
		h1.sayMyName();
		
		// 2. 사용자 정의 생성자로 만드는 방법
		Human h2 = new Human("고길동");
		System.out.printf("h2 주소 고유 번호 확인 : %s \n", h2);
		h2.sayMyName();
		
		System.out.println(FieldTest.count);
		
	}

}
