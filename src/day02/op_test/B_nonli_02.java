package day02.op_test;

import java.util.Scanner;

public class B_nonli_02 {
//	논리값(True / false) : 해당 논리 값을 반대로 뒤집는 연산자
//	!true --> false / !false --> true
	public 	void testMethod() {
		
//		System.out.println("true의 부정 : " + !true);
//		System.out.println("false의 부정 : " + !false);
		
//		정수한개 입력 받아, 
//		해당 숫자가 5의 배수인지 확인하는
//		로직 작성하기
		System.out.println(" 정수 한개 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		//ctrl + shift + o 를 누르면 자동으로 임포트 생성됨.
		
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 5의 배수 인가요? " + (num%5 == 0 ) );
		System.out.println("입력한 정수가 5의 배수가  아닌가요? " + !(num%5 == 0 ) );
		// !를 붙이면 정 반대 상황으로 바꿔줌.
		
	}
	

}
