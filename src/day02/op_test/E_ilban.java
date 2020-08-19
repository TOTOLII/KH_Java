package day02.op_test;

import java.util.Scanner;

public class E_ilban {
	
	Scanner sc = new Scanner(System.in);

	
	public void testMethod1() {
		// && : AND, 그리고 - 11 순위
		// || : or, 이거나 - 12 순위
		
		// (논리값) && (논리값)으로 사용.
		// (논리값) || (논리값)
		// ** 논리값 : 결과가 true/false로 나오는 수식
		
		// 14 <= age <= 19
		// 14 <= age && age <= 19
		
		System.out.println("나이를 입력 하세요 : ");
		int age = sc.nextInt();
		
		System.out.println(" 입력한 나이는 청소년에 해당하나요 ?" + (age >=14 && age<=19));
		
	}
	
	
	public void testMethod2() {

		// 응용1
		// 문자 --> 슷자
		// 입력한 문자가 대문자인지 확인하기

		System.out.println("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);		
		System.out.println(" ch가 대문자 인가요? " + (ch >= 'A' && ch<='Z'));
		System.out.println(" ch가 대문자 인가요? " + (ch >= 65 && ch<=90));
			
		// 응용2
		// 사용자 입력값 중 y, Y를 입력하였는지 확인하기
		System.out.println("계속 하시려면 y나 Y를 입력하세요 : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("계속 여부 : " + (ch2 == 'y' || ch2 == 'Y'));
		
		//즉, A && B는 A와 B 모두 참이어야 하며,
		//    A || B는 A와 B 둘 중 하나만 참이어도 된다.
	}
	

	public void testMethod3() {
		//심화 논리 연산자 기능
		
		// A && B
		// &&의 경우 앞, 뒤가 모두 참이어야 결과를 참이라고
		// 돌려주기 때문에 만약 앞의 식이 거짓이라면
		// 뒤의 논리 식을 확인하지 않는다.
		
		int num = 10;
		boolean result = (false && (++num > 0));
//		boolean result = (false & (++num > 0)); 연산자를 하나만 써주면 뒤에까지 읽는다.	
		System.out.println("num : " + num);
		
		
		// A || B
		// ||의 경우 앞, 뒤 둘 중 하나가 참이면 결과를 참이라고 
		// 돌려주기 때문에 만약 앞의 식이 참이라면 
		// 뒤의 논리식을 확인하지 않는다.
		
		int num2 = 10;
		boolean result2 = (true || (num2++ > 0));
		System.out.println("num2 : " + num2);
	}
}
