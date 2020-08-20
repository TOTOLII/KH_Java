package day05.silsub;

import java.util.Scanner;

public class Loop_Silsup {

	Scanner sc = new Scanner(System.in);
	
	
	public void test1() {
		// 문자열 한 개를 입력 받아, 
		// 총 10번 반복하여 해당 문자열을 화면에 
		// 출력하시오.  
		System.out.print("문자열을 입력해 주세요. : ");
		String str_var01 = sc.next();
		

	 // for문을 이용하여 풀기
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%s", str_var01);
//			}
		
//		while문 사용
		int i = 0;
		while (i<10) {
			System.out.print(str_var01);
		}
	}
	public void test2() {
		// 정수를 입력 받아 
		// 1부터 입력 받은 정수까지의 수를 홀수와 짝수로 구분하여
		// 홀수면 "당", 짝수면 "근"을 반복하여 출력 하시오. 
		// 예) 4입력 : 
		//      당근당근
		//     5입력 :
		//      당근당근당
		
		System.out.printf("정수를 입력해 주세요. : ");
		int it_Var02 = sc.nextInt();
		String str_Var02 = "";
		for (int i = 1; i <= it_Var02; i++) {
			
			if (i % 2 == 0) {
				str_Var02 += "근";
			} else {
				str_Var02 += "당";
			}
		}
		System.out.printf("%s", str_Var02);
	}
	public void test3() {
		// 정수 한 개를 입력 받아, 
		// 1부터 입력 받은 정수까지의 합을 
		// 출력하시오.
		System.out.print("정수를 하나 입력해 주세요. : ");
		int it_Var03 = sc.nextInt();
		int sum_Var03 = 0;
		
		if (it_Var03 > 0) {
			
			for (int i = 1; i <= it_Var03; i++) {
				sum_Var03 += i;
			}
		} else {
			System.out.println("양수를 입력해 주세요.");
		}
		System.out.printf("총 합 : %d", sum_Var03);
	}

	public void test4() {
		
		System.out.print("월 급여 입력 : ");
		int salary = sc.nextInt();
		
		System.out.print("매출액 입력 : ");
		int sales = sc.nextInt();
		
		double bonus = 0.0;
		
		if (sales >= 50000000) {
			bonus = 0.05;
		} else if (sales >= 30000000) {
			bonus = 0.03;
		} else if (sales >= 10000000) {
			bonus = 0.01;
		}
		
		System.out.printf("매출액 : %d \n", sales);
		System.out.printf("보너스율 : %d%% \n", bonus);
		System.out.printf("월 급여: %d \n", salary);
		System.out.printf("보너스 급여: %f \n", (salary*bonus));
		
	}
	
	public void test5() {
		//거스름
		System.out.print("받으신 금액을 입력하세요. : ");
		int money = sc.nextInt();
		
		System.out.print("상품 가격을 입력하세요 : ");
		money -= sc.nextInt();
		
		//거스름 돈을 화폐 단위에 따라 나눠 받을 공간
		int charge = money;
		
		if (money<1) {
			//만약에 금액이 부족하다면, 구매를 못하게 막는다.
			System.out.println("금액이 부족 합니다.");
			return;
		} 
		int unit = 50000;
		
		boolean sw = true; //스위치 변수
		
		for (int i = 1; i < 9; i++) {
			//화폐 단위 8가지 기준 반복
			int count = money/unit; //각 금액 단위 별
									// 매수/ 개수
			if (count !=0 ) {
				if (i < 5) {
					//지폐
					System.out.println(unit+"원 권 지폐" + count +"장");
					
				} else {
					//동전
					System.out.println(unit+"원 권 동전" + count +"개");
				}
			}
			money -= (unit * count);
			// 현재 처리한 거스름돈을  뺀 
			// 나머지 화폐 거스름돈
			
			if (sw) { //5로 시작하는 단위
				unit /= 5;
			} else { //1로 시작하는 단위
				unit /= 2;
			}
			sw = !sw; //true -> false / false -> true
		}
		
		System.out.println("======================");
		System.out.println("거스름돈 : " + charge + "원");
	}



}


