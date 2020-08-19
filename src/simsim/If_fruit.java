package simsim;

import java.util.Scanner;

public class If_fruit {

	Scanner sc = new Scanner(System.in);

	public void exercise() {		
	
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
	System.out.println();
	opinion();			
	
	}

public void opinion() {
	System.out.println("과일을 더 사시겠습니까? Y/N");
	String opN = sc.next();
	
	if (opN.equals("Y") || opN.equals("y")) {
		exercise();
	} else {
//		System.out.printf("여태까지 산 과일의 종류는 %s, 가격은 %d 입니다.", );
	}
 }
}