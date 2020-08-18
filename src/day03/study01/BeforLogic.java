package day03.study01;

public class BeforLogic {
	
	public static void main(String[] args) {
		
		// 조건문 : 어떠한 조건식을 통해 참과 거짓일 떄
		// 		   실행할 코드를 나눠주는 문법
//		
//		비교 연산자와 일반 논리 연산자 익숙해지기
//		조건문에 들어가는 조건식은 대부분 비교 연산자와
//		일반 논리 연산자로 이루어져 있다.
		
		int minHeight = 120;
		int maxHeight = 190;
		int count = 10;
		double mass = 10.0;
		boolean check = false;
		char ch = 'A';
		
//		-----------------------------------------------------    //
		//위의 6가지 변수를 활용하여
		//비교 연산자와 일반논리 연산자를 사용한
		// true / false를 각각 15개씩 만들기
		
		// -- true 15개 --
		System.out.println("true 결과 1 : " + (count==mass));
		System.out.println("true 결과 2 : " + (maxHeight > minHeight));
		System.out.println("true 결과 3 : " + (minHeight > count));
		System.out.println("true 결과 4 : " + (minHeight > mass));
		System.out.println("true 결과 5 : " + (maxHeight > count));
		System.out.println("true 결과 6 : " + (maxHeight > mass));
		System.out.println("true 결과 7 : " + (minHeight > (int)(ch)));
		System.out.println("true 결과 8 : " + (maxHeight > (int)(ch)));
		System.out.println("true 결과 9 : " + ((maxHeight < minHeight) == check));
		System.out.println("true 결과 10 : " + ((minHeight < count) == check));
		System.out.println("true 결과 11 : " + ((minHeight < mass) == check));
		System.out.println("true 결과 12 : " + ((maxHeight < count) == check));
		System.out.println("true 결과 13 : " + ((maxHeight < mass) == check));
		System.out.println("true 결과 14 : " + ((minHeight < (int)(ch) ==check)));
		System.out.println("true 결과 15 : " + ((maxHeight < (int)(ch) ==check)));
		
		// -- false 15개 --
		System.out.println("false 결과1 : " + (ch >= count && maxHeight == 150));
		System.out.println("false 결과 2 : " + (maxHeight < minHeight));
		System.out.println("false 결과 3 : " + (minHeight < count));
		System.out.println("false 결과 4 : " + (minHeight < mass));
		System.out.println("false 결과 5 : " + (maxHeight < count));
		System.out.println("false 결과 6 : " + (maxHeight < mass));
		System.out.println("false 결과 7 : " + (minHeight < (int)(ch)));
		System.out.println("false 결과 8 : " + (maxHeight < (int)(ch)));
		System.out.println("false 결과 9 : " + ((maxHeight > minHeight) == check));
		System.out.println("false 결과 10 : " + ((minHeight > count) == check));
		System.out.println("false 결과 11 : " + ((minHeight > mass) == check));
		System.out.println("false 결과 12 : " + ((maxHeight > count) == check));
		System.out.println("false 결과 13 : " + ((maxHeight > mass) == check));
		System.out.println("false 결과 14 : " + ((minHeight > (int)(ch) ==check)));
		System.out.println("false 결과 15 : " + ((maxHeight > (int)(ch) ==check)));
		
	}			
}