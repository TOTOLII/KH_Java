package day02.op_test;

import java.util.Scanner;

public class C_sansul {
	//일반적인 사칙연산에 쓰이는 연산자들
	
	public void testMethod() {
		int num1 = 10;
		int num2 = 20;
		
//		System.out.println("두 수의 합 : " + num1 + num2); 이 상태로 실행시 문자열 뒤의 num1 이 문자열로 바뀌어 1020으로 출력됨.
		System.out.println("두 수의 합 : " + (num1 + num2)); 
		System.out.println("두 수의 차 : " + (num1 - num2)); 
		System.out.println("두 수의 곱 : " + (num1 * num2)); 
		System.out.println("나누기한 몫 : " + (num1 / num2)); 
		// 나눗셈에 쓰이는 수는 0이 되어서는 안된다.
		
		System.out.println("나누기한 나머지 : " + (num1 % num2));
		
		//-------------------------------------------------------------
		
//		문자열과 '+'을 수행하는 경우
//		문자 하나와 숫자를 연산할 경우 문자는 숫자로 변한다.
//		문자열과 숫자를 연산할 경우, 숫자는 문자열로 변한다. ex) 1020
		
		System.out.println(10 + 'A'); // 10 + 65 = 75로 나오게 된다. > 자동형 변환
		System.out.println("10" + 'A'); // "10" + 'A' --> "10A"
		System.out.println("10" + 20); //1020
		System.out.println(10 + 20 + "_test_" + 30); // 30_test_30이 나옴.		
	}
	
	public void testUnicode() {
		// 유니코드 : 세계 주요 문자에 대응하는 숫자를 가진 언어 표현 체계
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
//		next()는 띄어쓰기가 없는 문자를 가지고 온다.
//		nextline()의 경우 띄어쓰기 있는 문자를 가지고 온다.
		
		int num = ch;
		System.out.println(ch + " 에 해당하는 유니코드 번호는 " + num + " 입니다.");

	}
}
