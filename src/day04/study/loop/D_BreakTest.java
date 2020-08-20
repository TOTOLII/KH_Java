package day04.study.loop;

import java.util.Scanner;

public class D_BreakTest {
	//분기문 : 반복문 내에서 반복 수행 중
//			  특정 상황에 놓였을 때 해당
//	 	   	  반복 수행에 영향을 주는 문법
//	 break : 
	
	public void testBreak1() {
		// 문자열을 입력받아
		// 글자 수를 출력하는 반복 프로그램 작성하기
//		      단, exit가 입력되면 강제 종료
		Scanner sc = new Scanner(System.in);
		String words = null;
		
		do {
			System.out.print("문자열 입력 : ");
			words = sc.next();
			
			if (words.equals("exit")) {
				break;
			} else {
				System.out.printf("글자 수 : %d \n" , words.length());
			}
		} while (true);
	}
	

}
