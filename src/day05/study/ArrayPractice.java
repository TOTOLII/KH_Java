package day05.study;

import java.io.StreamCorruptedException;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ArrayPractice {
	
	// 배열 실습
	// 자동 임포트
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// int형 배열 1개 선언 후
		// 값을 1~5까지 하나씩 추가하기
		
		int arr1[] = {1,2,3,4,5};	
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.printf("arr1[%d] : %d \n", arr1[i]);
		}
		
	}
	public void test2() {
		// 문자열을 반복해서 입력받고
		// 크기가 5인 배열에 저장한 후
		// 모두 저장 되었을 때 하나씩
		// 출력해서 결과 확인하기
		
		String[] arr = new String[5];
		
		// 입력문
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print("문자열 입력 : ");
			arr[i] = sc.next();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 문자열 : %s \n", i,arr[i]);
		}

		}
	public void test3() {
		// 길이가 5인 숫자 배열을 선언하고
		// 값을 100,200,300,400,500으로 
		// 초기화 한 후, 그  수들의 합을 for문으로
		// 구하는 프로그램을 작성하시오.
		
		int arr[] = {100,200,300,400,500};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}
	public void test4() {
		// 길이가 10인 배열을 선언하고
		// 각각의 공간에 값을 1부터 10까지 저장한 후
		// 그 수들의 합을 for문으로 구하는 프로그램을 작성하시오.

		// 배열(변수) 선언문
		int arr[] = new int[10];
		int sum = 0;
		
		// 입력부
		for (int i = 1; i < 11; i++) {
			arr[i-1] = i;
			sum += arr[i-1]; 
		}
		System.out.println(sum);
	}
	public void test5() {
		// 길이가 5인 숫자 배열을 선언 하고
		// 값을 100,~,500의 값으로 
		// 초기화 한 뒤, 숫자 하나를 입력받아
		// 숫자 번호에 맞는 값을 출력하기
		// 만약 없는 숫자라면 "입력한 공간은 없습니다" 출력하기
		//
		// -- 출력 예시--
		// 숫자입력 : 1
		// 해당 값 : 200
		// ------------
		// 숫자 입력 : 7
		// 입력한 공간은 없습니다.
		
		int[] arr= {100, 200, 300, 400, 500};
		
		System.out.print("숫자 입력 : ");
		int arr_Fd = sc.nextInt();
		
		if (arr_Fd>arr.length ) {
			System.out.println("입력한 공간은 없습니다.");
		} else {
			System.out.printf("해당 값 : %d", arr[arr_Fd]);
		}
	}
	
	public void test6() {
		// olleh -> hello
		// 문자열을 입력받아
		// 해당 문자열을 문자 배열에 한 문자씩 차곡차곡 저장한 후
		
		// == 출력 예시 ==
		// 문자열 입력 : 강아지
		// 결과 : 지아강
		
		
		System.out.print("문자열을 입력하세요. : ");
		String var_Bk = sc.next();
		
		char arr[] = new char[var_Bk.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = var_Bk.charAt(i);
		}
		
		for (int i = arr.length - 1; i > -1; i--) {
			System.out.print(arr[i]);
		}
	}
	
	
}
