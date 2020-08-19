package day02.op_test;

import java.util.Scanner;

public class J_teacherex {
	
	public void testMyMethod() {
		// 삼항연산자, 일반 논리 연산자를 사용하여
		// 카페 음료를 취향에 따라 선택하는 코드 만들기
		// ex) 뜨거운 음료 ? : true
		//     사이즈 ? : small
		//     가격 ? : 4000 >=  / 모카 / 아아
		//   > : name 님은 OOO 음료 small 사이즈를 추천합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객 명 : ");
		String name = sc.next();
		
		System.out.print("뜨거운 음료 ? (y/n) : ");
		
		char ch = sc.next().charAt(0);
		
		String isHot = (ch == 'y' || ch == 'Y') ? "HOT " : "ICE ";
		
		System.out.print("사이즈 ? : ");
		// 엔터값 제거용 nextLine()
		sc.nextLine();
		
		String size = sc.nextLine();
		
		System.out.print("가격 ? : ");
		int price = sc.nextInt();
		String coffee = (price >= 5000) ? "마끼아또" :
			              ((price >= 4000) ? "카페모카" : "아메리카노");
		// System.out.println(name+"님은 "+isHot + coffee + size + "사이즈를 추천합니다.");
		System.out.printf("%s님은 %s %s사이즈를 추천합니다. \n", 
				           name, isHot + coffee, size);
	}
	

}
