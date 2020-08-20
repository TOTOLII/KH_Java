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
		
		while (num < 5) {
			System.out.println("Hello World");
			num++;
		}
	}

}
