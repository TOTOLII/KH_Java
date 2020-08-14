package day01.study01.run;

//다른 패키지에 있는 클래스 호출하기.
// .* 을 붙이면 해당 패키지 안의 모든 클래스를 추가한다.
import day01.study01.var.*;

public class Main {

	public static void main(String[] args) {
		// 실행전용 메소드
		
		/* new TestVariable().method1();
		//실행 단축키 : ctrl + f11
		
		System.out.println();
		System.out.println("method2 실행");
		
		new TestVariable().method2(); 
		new TestVariable().method1();
		new TestVariable2().method1();
		new TestVariable2().method3(); 
		new TestVariable2().method4(); 
		
		new InputVariable().inputMethod2(); 
		new InputVariable().myInputMethod(); */
		new CastingTest().castMethod2();
	}

}
