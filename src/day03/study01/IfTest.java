package day03.study01;

import java.util.ArrayList;
import java.util.Scanner;

public class IfTest {
	
	/* 
	 * if 문은 특정 조건을 만족시킬 때 실행할 구문을 
	 * 실행할 구문을 구현하는 조건문이다.
	 * 순서도에서는 마름모 역활을 한다.
	 */
	Scanner sc = new Scanner(System.in);
	
	public void testMethod1() {
		
//		기본적인 if문
//		마스크 착용 유무를 입력 받아 
//		마스크를 착용해 주세요. 혹은
//		이용해 주셔서 감사합니다.
//		출력하기
		
		System.out.print("마스크 착용 하셨나요? (Y/N) : ");
		char answer =sc.next().charAt(0);
//		
//		//입력받은 값을 비교하여
//		//상황에 따른 결과 출력하기.
		if (answer == 'Y' || answer =='y') {
			System.out.println("이용해 주셔서 감사합니다.");
		} else {
			//위의 조건을 만족하지 않는/ 조건문이 거짓인 나머지 상황
			System.out.println("마스크를 반드시 착용해 주세요, (ㅇㅁㅇ)/");
		}
		
	}
	
	public void testMethod2() {
		
		// 조건에 따른 결과가 3개 이상일 경우
		// if-else if를 사용한다.
		// 국어, 영어, 수학 점수를 입력받아
		// 평균에 따른 성적 구하기

		/*
		 * - 기준 -
		 * 평균이 90점 이상이면 A
		 * 평균이 80점 이상이면 B
		 * 평균이 70점 이상이면 C
		 * 평균이 60점 이상이면 D
		 * 나머지 점수는 F
		*/
		
		System.out.print("국어 점수를 입력해 주세요. : ");
		int koR = sc.nextInt();
		
		System.out.print("수학 점수를 입력해 주세요. : ");
		int enG = sc.nextInt();
		
		System.out.print("영어 점수를 입력해 주세요. : ");
		int maT = sc.nextInt();
		
		int suM = (koR + enG + maT);
		int avG = suM / 3;
		String grade = "";
		//반복되는 코드를 보일러 코드라고 함.
		
//		if(avG >= 90) {
//			grade = "A";
//		
//		} else if (avG >= 80) {
//			grade ="B";
//			
//		} else if (avG >= 70) {
//			grade ="C";
//			
//		} else if (avG >= 60) {
//			grade = "D";
//			
//		} else {
//			grade = "F";
//		}
//		System.out.printf("당신의 성적은 %s입니다.", grade);	
//		grade = "";
		
		switch (avG) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;

		case 7:
			grade = "C";
			break;
		
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		System.out.println(grade);
	}
	
	public void testSimya() {
		// if문을 활용하여 메뉴판 만들기
		
		String meNu = "";
		int price = 0;
		String talK = "";
				
		// 1. 메뉴판 출력하기
		System.out.println("-- 김진호's 심야식당 ver 1.0 --");
		System.out.println("1. 떡볶이");
		System.out.println("2. 닭똥집");
		System.out.println("3. 두리안");
		System.out.println("4. 취두부");
		System.out.println("5. 솔의눈");
		System.out.println("--------------------------");
		
		// 2. 사용자에게 메뉴 고르게 하기
		System.out.print("메뉴나 선택하던지 : ");
		int selectMenu = sc.nextInt();
		
		if(selectMenu == 1 ) {
			meNu = "떡볶이";
			price = 5000;
			talK = "(4인 이상 주문)";
		} else if (selectMenu == 2) {
			meNu = "닭똥집";
			price = 30000;
			talK = "(단일메뉴)";
		} else if (selectMenu == 3) {
			meNu = "두리안";
			price = 0;
			talK = "두리안은 서비스 입니다.(Take out 비용 별도)";
		} else if (selectMenu == 4) {
			meNu = "취두부";
			price = 100000;
			talK = "(VAT 별도)";
		} else if (selectMenu == 5) {
			meNu = "솔의눈";
			price = 7500;
			talK = "";
		} else { 
			System.out.println("잘못 선택하셨습니다.");
		}
		System.out.printf("주문하신 음식은 %s, 가격은 %d 입니다. %s", meNu, price, talK);
	}

	public void testMethod3() {
		//다중 if문 (중첩 if문) 구현하기
		
		//학생 점수 입력 받아 성적을 표시하되
		// 90점 이상 A --> 95점 이상 A+
		// 80점 이상 B --> 85점 이상 B+
		// 70점 이상 C --> 75점 이상 C+
		// 70점 미만 F
		
		// ** 각 점수가 F 점수보다 높고,
		//    5점 이상이면 '+' 추가하기
		
		System.out.println("학생 점수 입력 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if (score > 89) { //90 점 이상 일때를 비교 하면, >=90 보다 >89가 훨씬 빠르다. 비교를 한번만 하기때문에 빠르다.
			grade = "A";
			if (score > 94) grade += "+";
		} else if(score > 79) {
			grade = "B";
			if (score > 84) grade += "+";
		} else if (score > 69) {
			grade = "C";
			if (score > 74) grade += "+";
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}

	public void exercise() {
		
		// [ 문제 ]
		// 과일이름(“사과”, ”바나나”, ”복숭아”,”키위”)를 입력 받아 해당하는 
	    	// 가격에 맞게 상품명과 가격이 출력되게 하시오.
		// 사과 - 1000원
		// 바나나 - 3000원
		// 복숭아 - 2000원
		// 키위 - 5000원
 
		// ** 문자열은 일반 문자나 기본 자료형들과 다르게
		//    참조 자료형의 형태를 띄기 때문에
		//    실제 문자열이 가진 값은 해당 문자열의 메모리 안 주소값을 가진다.
		//    따라서 Heap 메모리 안에 저장된 주소의 값을 실제 문자열과
		//    비교하게 되어 올바른 비교 결과가 나오지 않는다.
		//    이를 해결하기 위해 문자열들은 "문자열".equals("비교할 문자열")라는
		//    메소드를 별도로 제공한다.
		
//		Scanner sc = new Scanner(System.in);
		
		// 1. 메뉴판 출력
		System.out.println("-- 육현승's 과일 가게 ver 1.0 --");
		System.out.println(" 사과"); // 1000원
		System.out.println(" 바나나"); // 3000원
		System.out.println(" 복숭아"); // 2000원
		System.out.println(" 키위"); // 5000원
		System.out.println("--------------------");
		
		System.out.print("과일 이름을 골라 주세요 : ");
		String fruit = sc.next();
		String fruit_chG = ""; 
		int fruit_sum = 0; 
		int prY = 0;
		
		
		if (fruit.equals("사과") || fruit.equals("tkrhk") || fruit.equals("apple")) {
			fruit_chG = "사과";
			fruit_sum ++;
			prY = 1000;
			
		} else if(fruit.equals("바나나") || fruit.equals("qksksk") || fruit.equals("banana")){
			fruit_chG = "바나나";
			fruit_sum ++;
			prY = 3000;

		} else if(fruit.equals("복숭아") || fruit.equals("qhrtnddk") || fruit.equals("peach")) {
			fruit_chG = "복숭아";
			fruit_sum ++;
			prY = 2000;
			
		} else if(fruit.equals("키위") || fruit.equals("zldnl") || fruit.equals("kiwi")) {
			fruit_chG = "키위";
			fruit_sum ++;
			prY = 5000; 
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.printf("선택하신 과일은 %s이며, 가격은 %d원 입니다. \n", fruit_chG, prY);
		
		}
		
		
	}

