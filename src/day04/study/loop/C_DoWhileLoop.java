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

}
