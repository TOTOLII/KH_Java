package day02.op_test;

import java.util.Scanner;

public class I_MyOperator {

	
	public void testMyMethod() {
		// 삼항 연산자, 일반 논리 연산자를 사용하여
		// 카페 음료를 취향에 따라 선택하는 코드 만들기
		// ex) 뜨거운 음료 ? : true or false
		// ex) 사이즈 ? : short : tall : grande
		// ex) 가격? : 4000 >=  /모카 /아아
		// > : name님은 000음료 small 사이즈를 추천합니다.
		
		// 뜨거운 음료 - cpy_temp
		// 사이즈 : cpy_Size
		// 가격 : cpy_Pry
		
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하시는 온도를 알려주세요.");
		int cpy_temp = sc.nextInt();
		String result_temp = (cpy_temp<=30) ? "차가운" : ((cpy_temp<=70) ? "미지근한" : "뜨거운");
		
		
		System.out.println("사이즈를 선택 하세요. (short : s, tall : t, grande : g)를 입력하세요.");
		String cpy_Size = sc.next();
		String result_Size = (cpy_Size=="s") ? "short" : (cpy_Size=="t") ? "tall" :"grande";

		
		System.out.println("희망 가격을 입력해 주세요.");
		int cpy_Pry = sc.nextInt();
		String result_Pry = (cpy_Pry<=4000)? "아이스 아메리카노" : "모카";
		
//		System.out.println("ooo님에게 추천하는 커피는 :" + result_temp +" " + result_Size +" "+ result_Pry + "입니다.");
		System.out.printf("000님에게 추천하는 커피는 %s %s %s 입니다", result_temp, result_Size, result_Pry);
		sc.close();
	}
}
