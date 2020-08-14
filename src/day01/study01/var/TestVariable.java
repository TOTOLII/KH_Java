// 1. 패키지 생성
package day01.study01.var;

// 2. 클래스 생성 (앞 글자를 대문자로!)
public class TestVariable {
	
	//기능 제공 메소드 만들기
	
	public void method1() {
		
		// 일반 데이터 출력
		// 일반 데이터를 사용하는 것보다 
		// 변수를 사용하는 것이 오류 발생이 적어 변수를 사용함.
		System.out.println(2500000);
		
		//-------------------------------//
		
		// 변수 사용하기  
		// 공간(변수)에 특정값을 넣어두어라.
		// 공간에 값을 대입해라!
		int sal = 2500000;
		System.out.println("sal = " + sal);
	}
	
	public void method2() {

		// 변수 선언
		// 문자가 얼마나 입력될지 모르는 경우 문자열로 선언
		// 1.변수선언 (회원 정보)
		String name;// 이름	  - String(문자열)
		String num;// 전화번호  - String(문자열)
		char gender;// 성별        - char(문자)
		double hei;// 신장        - double(실수)
		double wei;// 몸무게     - double(실수)
		int age;// 나이        - int(정수)
		String id;// id     - String(문자열)
		String pw;// pw     - String(문자열)
		boolean mrg;// 결혼 여부 - boolean
		
		// 2. 선언한 변수에 값 대입 (값 넣기)
		
		name = "박재현";
		num = "0106589****";
		id = "angeloutus";
		pw = "angeloutus123";
		gender = 'M'; //char의 경우 ""가 아닌 ''로 데이터를 입력
		hei = 175.1;
		wei = 83.3;
		mrg = false;
		age = 25;
		
		// 3. 변수안의 값 확인하기.
		System.out.println(name);
		System.out.println(num);
		System.out.println(id);
		System.out.println(pw);
		System.out.println(gender);
		System.out.println(hei);
		System.out.println(wei);
		System.out.println(age);
		System.out.println(mrg);
		
		
		
		
		
	}
	
}