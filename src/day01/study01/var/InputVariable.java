package day01.study01.var;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputVariable {
	// 기능 제공용 클래스

	//java 1.5 이전버젼 코드
	public void inputMethod() {
		
		BufferedReader rd 
		= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자를 입력하세요. : ");
		
		try {
			
			String value = rd.readLine();
			int result = Integer.parseInt(value);
			System.out.println("입력하신 숫자는" + result + " 입니다.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
}
		
	
	//Java 1.5버젼 이후부터는 키보드의 입력값을 위보다 쉽게 처리하게 되었다.
	
	public void inputMethod2() {
		// system.in  : 키보드 (입력자원)
		// system.out : 모니터 (출력자원)
		// system.err : 표준 에러 출력
		
		//scanner : 각각의 자료형 별로 키보드의 입력값을 처리해 주는 객체
		
		Scanner sc = new Scanner(System.in);
		
		//키보드 입력을 위한 변수 공간 선언
		
		String name; // 이름
		int point;   // 점수
		double avg;  // 평균
		
		//화면에 값을 입력 받기 위한 안내 메시지 출력하기
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("점수를 입력하세요 : ");
		point = sc.nextInt();
		
		System.out.print("평균을 입력하세요 : ");
		avg = sc.nextDouble();
		
		//키보드로 입력한 내용 출력하기
		
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + point);
		System.out.println("평균 : " + avg);
	}
	
	public void myInputMethod() {
		// 기본 자료형 3가지 이상을 사용하여 
		// 도서 정보를 입력받는 프로그램 만들어 보기
		// 단, Scanner를 사용하며,
		// 변수의 이름은 aaa, bbb 금지.
		// 그럴듯 하게 직접 지어 사용하기.
		
		//변수명
		// 책 이름 : bk_Name (String)
		// 가격 : bk_Prc (int)
		// 1년 동안 팔린 평균 권수 : bk_Sell(int)
		// 1달 동안 팔린 평균권수 : bk_avg(double)
		// 재고현황 : bk_Stock (boolean)

		
		Scanner sc = new Scanner(System.in);
		
		String bk_Name;
		int bk_Prc;
		int bk_Sell;
		double bk_Monavg;
		boolean bk_Stock;
		
		System.out.print("책 제목을 입력하세요 : ");
		bk_Name = sc.nextLine();
		
		System.out.print("책 가격을 입력하세요 : ");
		bk_Prc = sc.nextInt();
		
		System.out.print("1년 동안 팔린 권수를 입력하세요 : ");
		bk_Sell = sc.nextInt();
		
		System.out.print("책의 재고 현황을 입력하세요 : ");
		bk_Stock = sc.nextBoolean();
		
		bk_Monavg = bk_Sell / 12;
		
		System.out.println("책 제목 : " + bk_Name);
		System.out.println("책 가격 : " + bk_Prc);
		System.out.println("1년동안 팔린 권수 : " + bk_Monavg);
		System.out.println("책 재고 현황 : " + bk_Stock);
	}
}
