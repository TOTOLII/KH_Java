package day05.study;

public class ArrayTest {
	// 기능 제공 메소드들만 담은 클래스

	public void testArray1() {
		// 배열 사용하기

		// 변수만 사용해서
		// 학생 국어 점수 관리하고

		int kor1 = 80;
		int kor2 = 75;
		int kor3 = 70;
		int kor4 = 100;
		int kor5 = 35;
		// ... 50명 이라면?

		// 변수가 너무 많으면 해당 변수를
		// 사용하기도 어려울 뿐더러 관리, 연산처리 등의
		// 번잡함이 생긴다. 변수의 이름도 각각 달라서
		// 반보군을 쓸 수도 없다.

		// .... Ah! 같은 자료형이면 하나로 묶어버리자!

		// 배열
		int[] arr = new int[5];
//		int arr[] = new int[5]; 로 사용해도 됨.

		// 각 배열의 방에 선언한 자료형(int)과 일치하는 값을
		// 하나씩 순서대로 저장할 수 있다.
		// 단, 시작 번호는 0부터

		arr[0] = 35;
		arr[1] = 100;
		arr[2] = 70;
		arr[3] = 75;
		arr[4] = 80;
		// .....

		// 배열 이름으로 변수명이 통일 되기 때문에
		// 반복문으로 합계를 계산 할 수도 있다.

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.printf("sum : %d", sum);
	}

	public void testArray2() {

		// 배열 사용방법
		// 1. 선언 방식
		// 자료형[] 변수명;
		// 자료형 변수명[];

		// 배열을 선언하면 Heap 메모리에
		// 배열의 크기만큼 공간을 할당하고
		// 가장 앞에 있는 값의 주소 고유 번호를
		// 가져와 stack 메모리에 저장한다.

		// 생성 및 초기화 방식
		// 1. 공간만 할당하는 경우
		int[] arr = new int[5];

		// 2. 배열의 값으로 초기화하여 선언하는 경우
		int arr2[] = new int[] { 1, 2, 3, 4, 5 };

		// ERROR - 배열의 길이와 안의 값을 같이 선언할 수는 없다!
//		int[] arr3 = new int[10] {1,2,3,4,5};

		// 3. 만약 배열의 값으로 선언 할 경우
		// new 키워드를 생략할 수 있다.

		int arr4[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 똑같은 결과값을 가지는 코드를 짧게 만드는 것을 short hand라고 한다.
		System.out.println(arr4);

		char arr5[] = new char[10];
		System.out.println("arr5 :" + arr5);

		// 참조 자료형
		// String, 배열 등과 같이
		// Heap 메모리에 값을 저장하는 변수들은
		// 별도의 주소 고유번호를 가지게 되는데,
		// 이렇게 new로 생성하는 변수를
		// '주소를 참조한다' 하여 참조 자료형이라고 부른다.
		// (Reference Variable / Type)

		// heap 메모리에 들은 값은 우리가 직접 메모리 주소를 확인할 수는 없다.
		// 대신 고유의 주소에 들어 있다 라는 걸 확인 시키는 방법이 존재한다.

		// 1. 주소 고유 번호 확인하기
		System.out.println("arr4 : " + arr4);
		System.out.println("arr5 : " + arr5);

		// 2. hashCode 확인하기
		System.out.println("arr4.hasCode : " + arr4.hashCode());
		System.out.println("arr5.hasCode : " + arr5.hashCode());
	}

	public void testArrayCopy() {
		// 얕은 복사와 깊은 복사
		// 1. 얕은 복사 
		// 배열의 주소 고유번호만 복사하는 방법
		
		int[] originArr = {1,2,3};
		int[] copyArr = originArr;
		
		//안에 있는 내용 출력하기
		for (int i = 0; i < originArr.length; i++) {
			System.out.printf("originArr[%d] : %d \n", i, originArr[i]);
		}
		/*
		//repeat code
		originArr[2] = 1004;
		
		for (int i = 0; i < originArr.length; i++) {
			System.out.printf("originArr [%d] : %d \n", i, originArr[i]);
		}
		*/
		
		System.out.println("-------------------------------");

		for (int i = 0; i < copyArr.length; i++) {
			System.out.printf("copyArr[%d] : %d \n" , i,  copyArr[i]);
		}
		
		System.out.println("-- 원본 변경하기 --");
		originArr[1] = 6;
		
		for (int i = 0; i < originArr.length; i++) {
			System.out.printf("originArr[%d] : %d \n", i, originArr[i]);
		}
		
		System.out.println("-------------------------------");

		for (int i = 0; i < copyArr.length; i++) {
			System.out.printf("copyArr[%d] : %d \n" , i,  copyArr[i]);
		}
	}
	
	public void testArrayCopy2() {
		// 2. 깊은 복사
		// -1- for문 사용하기
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr1 = new int[originArr.length];
		
		for (int i = 0; i < originArr.length; i++) {
			copyArr1[i] = originArr[i];
		}
		
		//repeat code
		originArr[2] = 1004;
		
		for (int i = 0; i < originArr.length; i++) {
			System.out.printf("originArr [%d] : %d \n", i, originArr[i]);
		}
		
		
		
		// 내용 확인하기
		// arrays.copyof(arr1, arr.length)라는 방법이 있는데
		// 이는 for문과 똑같아 사용을 권장하지 않음
		// (우리는 편하게 사용하지만 처리하는 과정에서
		// for문을 사용하기 때문에 그냥 for문을 사용하는 것이 좋음
		for (int i = 0; i < copyArr1.length; i++) {
			System.out.printf("copyArr1[%d] : %d \n", i, copyArr1[i]);
		}
		
		System.out.println("---------------------------");
		// -2- System.arraycopy();
		// System.arraycopy (복사할 원본 배열 ,
		//					 원본 배열의 시작번호,
		//					 사본 배열,
		// 				 	 사본 배열의 시작번호,
		//					 복사할 갯수);
		
		int[] copyArr2 = new int[10];
		
		System.arraycopy(originArr, 0, copyArr2, 3, originArr.length);
		
		for (int i = 0; i < copyArr2.length; i++) {
			System.out.printf("copyArr2[%d] : %d \n", i, copyArr2[i]);
		}
		
		System.out.println("---------------------------");
		// -3- clone() 메소드 사용하기
		int[] copyArr3 = new int[10];
		System.out.printf("원본 배열 주소 번호 : %s \n", originArr);
		System.out.printf("사본 배열 주소 번호 : %s \n", copyArr3);
		copyArr3 = originArr.clone();
		
		System.out.printf("원본 배열 복제 후 : %s \n", originArr);
		System.out.printf("사본 배열 복제 후 : %s", copyArr3);
	}

	 public void testArray3() {
		 
		 // 배열의 단점 :
		 // 1. 같은 자료형만 묶을 수 있다.
		 // 2. 배열은 한 번 크기(길이)를 선언하면 다시는 바꿀 수 없다.
		 // *  만약 배열을 지정 한  다음에 배열의 크기를 확장하려면, 
		 //    깊은 복사를 활용하여 큰 배열에 원래 있던 배열을 집어넣는 방법을 사용해야 함.
		 
		 int[] arr = new int[5];
		 
		 //원래 존재하던 공간만큼은 사용하는데 문제가 없다.
		 for (int i = 0; i < arr.length; i++) {
			
			 arr[i] = i * 10;
		}
		// 출력문
		 for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d \n", i,arr[i]);
		}
		 // ArrayIndexOutOfBonus :
		 // 만약 우리가 선언한 배열의 크기보다 더 큰 범위로
		 // 값을 저장하고자 한다면 발생하는 에러
		 arr[7] = 500; // --ERROR!!
		 
		 // 배열의 순번 중 음수는 없다. 무조건 0부터 시작!
		 // arr[-1] = 300; ---ERROR!!
	 } 
	 
	 // 자료형 기본값 테스트 전역 변수 (Heap)
	 boolean booleanChk;
	 byte byteChk;
	 short shortChk;
	 int intChk;
	 long longChk;
	 float floatChk;
	 double doubleChk;
	 String strChk;
	 
	 public void testValue() {
		 System.out.println("boolean 기본값 : " + booleanChk);
		 System.out.println("byte 기본값 : " + byteChk);
		 System.out.println("short 기본값 : " + shortChk);
		 System.out.println("int 기본값 : " + intChk);
		 System.out.println("long 기본값 : " + longChk);
		 System.out.println("float 기본값 : " + floatChk);
		 System.out.println("double 기본값 : " + doubleChk);
		 System.out.println("String 기본값 : " + strChk);
	 }
	 


}
