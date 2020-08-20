package day04.study.loop;

import java.util.Scanner;

public class C_DoWhileLoop {
	
	Scanner sc = new Scanner(System.in);
	
	public void beforeDowhile() {
		// 기존의 while문은 
		// 실행 조건이 참 / 거짓 이냐에 따라 
		// 실행이 한 번도 되지 않는 경우가 
		// 생길 수 있다!
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
//		while (num < 5) {
//			System.out.println("Hello World");
//			num++;
//		}
		// while의 경우 조건을 먼저 비교하기 때문에
		// 조건에 맞지 않으면 실행을 하지 않는다.
		// 하지만, 만약 최소한 한 번은 꼭 실행을 해야 한다면?
		
		do {
			System.out.println("Hello world");
			num++;
		} while (num <5);
		
		// do-while은 조건식이 밑에 존재하여 최소 한 번은
		// 꼭 실행 할 수 있다!
	}
	
	public void testDoWhile1() {
		// do-while 사용형식
		// do {
		// ...
		// } while(조건식);
		
		// 키보드로 문자열을 입력받아
		// 화면에 출력하기
		// 단, '나가기' 라는 문자열을 입력하면
		// 프로그램 종료하기
		
		String msg = null;
		// 컴퓨터 상 아무것도 없는 공간 'null'이라고 함
		// 문자열은 사용자가 입력하기 전까지 얼마나 긴 내용이
		// 들어올 지 알 수 없다.
		
		// 따라서, 이러한 문자열은 
		// Heap 메모리 공간에 값이 저장된다.
		// 또한 해당 공간에 저장된 주소(의 고유변호)를 
		// 변수에 전달하며, 변수명.equals("비교할 값"); 으로 
		// 주소의 고유 번호가 아닌 실제 값을 비교하도록
		// 해야 한다.
		do {
			System.out.print("문자열  : ");
			msg = sc.next();
			
			System.out.printf("입력한 문자열은 %s 입니다. \n", msg);
			
		} while (!msg.equals("나가기") && !msg.equals("skrkrl") && !msg.equals("out")); //"나가기"가 아니라면 반복실행
		
	}	
	
	public void testDoWhile2() {
		String msg = null;
		
		do {
			System.out.print(" 문자열 : ");
			msg = sc.next();
			
			if (msg.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;				//분기문
				
			} else { // 입력한 문자열이 exit가 아니라면
				System.out.printf("입력한 문자열은 %s입니다 \n", msg);				
			}
			
		} while (true); 
	}
}