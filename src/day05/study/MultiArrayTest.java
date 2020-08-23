package day05.study;

public class MultiArrayTest {
	// 다차원 배열
	// 다차원 배열이란
	// 여러 배열을 하나의 더 큰 배열의
	// 개념으로 묶어 사용하는 배열
	// ex)
	// 1반, 2반, 3반
	// 1반 ( 고길동, 최길동, 홍길동)
	// 2반 ( 김유신, 박유신, 차유신)
	// 3반 ( 둘리, 또치, 도우너)

	public void test1() {
		int[] ban1 = { 1, 2, 3, 4, 5 };
		int[] ban2 = { 6, 7, 8, 9, 10 };
		int[] ban3 = { 11, 12, 13, 14, 15 };
		// ban이 50개 라면?

		// 만약 배열이 여러 개가 된다면,
		// 변수가 많았던 것 처럼 배열도 관리하기 힘들어 진다.
		// 따라서 위의 배열들도 하나의 더 큰 배열로 묶어주는
		// 개념을 도입하였는데, 이것이 바로 2차원 배열이다.

		int[][] ban = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }
				};

		// 만약 묶은 반마다 학생 수가 다르다면..?
		// 각 배열 별로 크기가 달라도 이를 하나로 묶을 수 있는데,
		// 이를 가변 배열이라 칭한다.
		// 들쭉날쭉 하게 만들 수 있다.

		int[][] bans = { 
				{ 1, 2, 3, 4, 5 },
				{ 1, 2, 3 },
				{ 4, 5 }
				};
	}
	// 다차원 배열 선언시
	// 길이를 선언할 때 반드시 앞에서 부터 선언해야 한다.
	public void test2() {
	int [][]arr = new int[3][3];
	int num = 1;
	
	for (int i = 0; i < arr.length; i++) { //배열 갯수
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j] = num++;
		}
	}
	
	// 2차원 배열의 값 출력하기
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.printf("%2d", arr[i][j]);
			}
		System.out.printf("\n");
		}
	}
	
	public void test3() {

		// 5*5 배열을 만들어서
		// 1부터 25까지 값을 추가한 후
		// 1~25까지 
		// 5개씩 끊어서 츨력하기
		// 1 2 3 4 5
		// ...
		// 21 22 23 24 25
		
		int arr[][] = new int[5][5];
		int sum = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sum;
				sum++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void test4() {

		//test3() 메소드를 응용하여
		// 화면에 값을 아래와 같은 형식으로 출력해 보기
		// -------------
		// 1  6 11 16 21
		// 2  7 12 17 22
		// 3  8 13 18 23
		// 4  9 14 19 24
		// 5 10 15 20 25
		// --------------

		int arr[][] = new int[5][5];
		int sum = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sum;
				sum++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[j][i]);
			}
			System.out.println();
		}

		
	}

}

