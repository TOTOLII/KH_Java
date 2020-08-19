package day04.study.loop;

import java.util.Scanner;

public class A_ForLoop {
	// 반복문
	// 어떠한 계산, 출력을 연달아 수행해야 할 경우
	// 직접 하나하나 작성하지 않고,
	// 컴퓨터를 통해 자동으로 반복을 수행하는 문법
	
	//1. For : 반복 횟수에 제한이 있는 반복문  ★ * 500
	//2. while : 반복 횟수에 제한이 없는 반복문 ★ * 500
	//3. do - while : 최초 한 번은 반드시 실행하는 반복문
	
	//for 사용형식
	//for(시작할 숫자 ; 비교할 조건 ; 증가할 반복 숫자) {...}
	
//	new A_ForLoop().beforeForLoop();
//	1부터 10까지의 합을 구하시오.
//	반복문 사용 전
//	sysout(1+2+3+4+5+6+...+9+10);
	
	Scanner sc = new Scanner(System.in);
	
	public void beforeForLoop() {
		
		System.out.print("반복할 횟수를 입력해 주세요. : ");
		int a = sc.nextInt();
		
		for (int i = 0; i <= a; i++) {
			System.out.println("hellow world " + i );
			
		}
	}
//	반복문 사용 시
	public void afterLoop() {
		
		int sum = 0; //1부터 10까지의 합을 담을 공간
		
		for (int i = 0; i <= 10; i++) {
			sum += i;
			System.out.printf("%d 반복, 계산한 결과 : %d \n  ", i,sum	);
		}
	}
	
	public void testForLoop2() {
		// 1. 단순 반복 (기본형태)
		// 1 ~ 100까지의 합을 구하시오.
		// 반복할 횟수 입력 받아 합 구하기
		int sum1 = 0;
		System.out.println("0 부터 더하고 싶은 값을 입력하세요. : ");
		int sum_Ob = sc.nextInt();
		
		for (int i = 0; i < sum_Ob; i++) {			
			sum1 += sum_Ob;
			System.out.printf("%d 번째 값 : %d \n", sum_Ob, sum1);
		}
		
		// 2. 역 반복 형태
		// 5~1까지 반복하기
		// 시작할 값(숫자) : 5
		// 끝나는 값(숫자) : i >= 1
		// 증감식 (++/--) : i--
		
		for (int i = 5; i > 0; i--) {
			System.out.printf(" i : " + i);
		}
	}
	
	public void testForLoop3() {
		// for 반복문 응용하기 1
		// 구구단 2단을
		// for 반복문을 사용하여
		// 2 * 1 = 2 형식으로 출력해보기
		
		System.out.print("확인하고 싶은 구구단의 단수를  입력하세요. : ");
		int gugudan_Ob = sc.nextInt();
		
		System.out.printf("%d 구구단 \n", gugudan_Ob);

		for (int i = 0; i < 10; i++) {
			
			System.out.printf("%d * %d = %2d \n", gugudan_Ob, i, (gugudan_Ob * i)); 
			// %xd에서 x에 수를 넣으면 글자수를 맞춰 줌
		}
	}
	
	// 실습 1.
	// for문과 if문을 활용하기
	// 속칭 (for안에 if 있다)
	// 1에서 10까지의 수 중 홀수들의 합 구하기
	
	public void test_Ex() {
		// TODO Auto-generated method stub

		int sum_Ex1 = 0;
		System.out.print("홀수 합을 구할 값을 입력 해 주세요. : ");
		int val_Ex1 = sc.nextInt();
		
		for (int i = 1; i <= val_Ex1; i++) {
			
			if ((i%2) != 0) {
				sum_Ex1 += i;
			}
		}
		System.out.printf("1 ~ %d 안에 들어있는 홀수 들의 합 : %d",val_Ex1, sum_Ex1);
	}
	
	public void testForLoop4() {
		
		// for문 +Scanner
		// 실습1
		// 정수하나를 입력 받아
		// 1부터 해당 숫자까지의 합을 구하시오.
		System.out.print("정수하나를 입력해 주세요. : ");
		int sil_ex01 = sc.nextInt();
		int sum_ex01 = 0;
		
		for (int i = 1; i <= sil_ex01; i++) {
			sum_ex01 += i;
		}
		System.out.printf("1부터 %d까지의 합은 : %d", sil_ex01, sum_ex01 );
	}
	
	public void testForLoop5() {
		// 실습2
		// 한자리의 정수를 입력받아
		// 1부터 해당 숫자까지의 짝수들의 합을 구하시오.
		System.out.print("한자리 정수를 입력해 주세요 : ");
		int sil_Var02 = sc.nextInt();
		int sum_Ex02 = 0;
		
		for (int i = 1; i <= sil_Var02; i++) {
			if (sil_Var02<10 && i%2 == 0) {
				sum_Ex02 += i;
				
			} else if (sil_Var02 <10 && i%2 != 0) {
				sum_Ex02 += 0;
		
			}else {
				System.out.println("오류! 한자리 정수를 입력해 주세요!");
				return;
			}		
		}
		System.out.printf("1부터 %d까지의 짝수의 합은 : %d 입니다 \n", sil_Var02, sum_Ex02);
	}
	
	public void testForLoop6() {
		// 실습3
		// 한 자리의 정수를 입력 받아
		// 해당 숫자에 맞는 구구단을 출력하시오
		System.out.print("확인 하고 싶은 한자리 구구단을 입력하세요 : ");
		int sil_Var03 = sc.nextInt();
		
		if (sil_Var03<10) {
			System.out.printf("---%d단--- \n",sil_Var03);
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %2d \n", sil_Var03, i, (sil_Var03*i));
			}
		} else {
			System.out.println("오류! 한자리 정수를 입력해 주세요!");
			return;
		}
	}
	
	
}
