package day04.study.loop;

import java.util.Scanner;

public class E_ContinueTest {
	// continue : 반복문 내에서
	//	 		    특정 조건을 만날 경우,
	//	                    해당 반복을 건너 뛰게 하는 역활

	// if (조건문) { continue; }
	
	// 반복횟수는 여전히 1 증가해서
	// 마치 한 번 반복을 정상적으로 수행한 것 처럼
	// 넘길 수 있다.
	Scanner sc = new Scanner(System.in); 
	
	public void testContinue1() {
		// 1 ~ 100 번 까지 사원들 중
		// 40번 대의 사원을 제외한 
		// 나머지 사원의 수를 구하시오.
		
		int total = 0;
		
		for (int i = 0; i <= 100; i++) {
			
			if (i > 39 && i < 50) {
				System.out.printf("%d번 째 사원 제외! \n", i);
				continue;
//			} else {
			}
			total++;
		}
		System.out.printf("총 사원수 : %o \n", total);
	}
	
	public void testContinue2() {
		// 구구단 출력하기
		// 단, for문을 활용하고
		// 각 단의 홀 수 곱만 출력하기
		// ----- N 단 -----
		// N * 1 = M
		
		System.out.print("확인 할 단수를 입력하세요. : ");
		int gugu_Var = sc.nextInt();
		
		System.out.printf("------ %d 단 ------ \n", gugu_Var);
		for (int i = 1; i < 10; i++) {
			
			if (i%2 == 1) {
				System.out.printf("%d * %d = %d \n", gugu_Var, i, (gugu_Var*i));
				continue;
			}
			
		}
		
		
	}
	
}
