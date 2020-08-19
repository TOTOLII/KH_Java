package day04.study.loop;

import java.util.Scanner;

public class B_While_Loop {
	
	Scanner sc = new Scanner(System.in);
	
	public void testWhileLoop1() {
		
		// for문은 특정 반복 횟수안의 반복을 
		// 수행할 때 사용하지만,
		// while문은 별도의 반복 횟수 없이
		// 특정 조건만 만족하면 무한정 수행하는 
		// 무한 반복의 특성을 지닌다.
		
		// while 사용형식
		// while(조건식) { . . . } 
		while (true) {
			System.out.println("hello World!");
		}
	}
	
	public void testWhileLoop2() {
		// 문자열을 하나 입력 받아
		// 문자열의 길이 만큼
		// 문자 하나씩 추출하기
		
		//문자를 입력하라는 안내 문구 출력
		System.out.print("문자열을 입력해 주세요. : ");
		String str = sc.next(); //띄어쓰기가 없는 문자열 한줄 받기
		
		// while문을 일정 횟수만큼 정해서
		// 반복 시키고자 한다면
		// while문 전에 반복 횟수용 변수를 하나 
		// 생성하여 해당 변수를 조건으로 사용한다.
		int i = 0;
		while (i < str.length()) {
			
			// 반복 횟수가 불 확실할 때 주로 while을 사용한다.
			System.out.printf( "%d 번째 문자 : %s \n" ,i , str.charAt(i));
			i++;
		}
	}
	
	public void testWhileLoop3() {
		// 1부터 입력 받은 수까지의 합 계산하기
		int sum=0;
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		int i = 1;
		
		while ( i <= num) {
			sum += i;
			i++;
		}
		System.out.println("sum : " + sum);
	}
	
	public void testWhileLoop4() {
		
		// while 문 중첩 사용 ( while안의 while 문)
		// 구구단 2~ 9 단까지 모두 출력하기
		
		int dan = 2;
		
		while (dan < 10) {
			//각 단을 반복하도록 생성
			System.out.printf("\n ----- %d 단 ----- \n", dan);
	
			int vaR = 1;
			while (vaR < 10) {
				System.out.printf("%d * %d = %2d \n", dan, vaR, (dan*vaR));
				vaR++;
			}
			dan++;
		}
	}
	
	public void testWhileLoop5() {
		// while 문을 이중 반복하여 
		// 직사각형 * 찍기
		// 가로, 세로 길이를 입력 받아
		// 직사각형 모양의 별 찍기
		System.out.print("원하시는 가로 길이를 입력해 주세요. : ");
		int coL = sc.nextInt();
		
		System.out.print("원하시는 세로 길이를 입력해 주세요. : ");
		int roW = sc.nextInt();
		
		int i = 1;
		
		while (i<=coL) { //세로줄 반복
			
			int j =1;
			while (j <= roW) { //가로줄 반복
				if (j != roW) {
					System.out.print("*");
				} else {
					System.out.println("*");
				}
				j++;
			}
			i++;
		}
		
		
	}
	
	public void testWhileLoop6() {
//		삼각형 모양으로 별 찍기
		System.out.print("만들려는 삼각형의 높이를 입력 하세요. : ");
		int coL = sc.nextInt();
		int roW = coL;
		int i = 1;
		
		while (i <= coL) {
			System.out.println();
		}
		
	}
	
	
}
