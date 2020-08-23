package day06.study;

public class Human {
		// 객체 지향 언어 (OOP : Object Oriented Programming)
		//   -> 객체를 사용하여 프로그램을 작성하는 것
		// 객체는 Class(클래스)에 의해 만들어짐
		// C++ : 클래스에 의해 만들어진 변수 
		//       클래스명 변수명;
		// Java : Heap 메모리에 값을 할당하여 
		//        주소값을 받을 수 있는 변수
		//  클래스명 변수명 = new 클래스명();

		// --클래스 작성 순서--
	 	// 1. 클래스 내에서 사용할 변수 선언(Member / Field)
		public String name;// 이름 (String name) 
	    int age;// 나이 (int age) (default)
	    protected char gender;/// 성별 (char gender)
	    private String phone;// 연락처 (String phone)
	    String address;// 주소  (String address) ---> 추상화
	    
	    // 2. 생성자 (Constructor)
	    // 해당 클래스를  new로 생성할 때 사용하는
	    // 객체 생성 전용 메소드
	    // 생성자 : 접근 제한자 클래스명 ( [매개 변수] ) {. . .}
	    
	    public Human() {
	    	// 기본 생성자 ( default Constructor)
	    }
	    public Human(String name) {
	    	this.name = name;
	    	// 어떠한 값을 전달받아 
	    	// 현재의 전역 변수 정보를 수정할 때
	    	// 사용하는 사용자 정의 생성자
	    }
	    
	    // 3.기능 제공 메소드
	    // 현재 클래스의 정보를 활용하여
	    // 특정 기능을 제공하기 위해 만드는 메소드
	    // [선언 방식]
	    // 접근 제한자 [예약어] 반환 자료형(리턴 타입) 메소드명(매개 변수) {...}
	    public void sayMyName() {
	    	System.out.printf("내 이름은 %s 입니다. \n", name);
	    }
}
