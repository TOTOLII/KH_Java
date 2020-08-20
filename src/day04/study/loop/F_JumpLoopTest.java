package day04.study.loop;

public class F_JumpLoopTest {

	// 만약 여러개의 중첩 반복문을 모두 한꺼번에 
	// 벗어나고 싶다면....?
	
	// ** 작성한 코드가 복잡해 질 수록
	//    코드의 흐름을 이해하기 어렵게 만드는 주범이 될 수있다.
	
	public void testJumpLoop() {
		// 1부터 10까지의 합을 무한 반복하는 도중
		// 라벨로 뛰쳐 나가기

		label : //jump : /loop: /등등 나갈 이름명을 설정
		while (true) {
			int sum = 0;

			for (int i = 1; i < 11; i++) {
				sum += i;

				if ( i == 3) {
					System.out.println(sum); //1+2+3;
					break label;
				}
			}

		}
	}
	
}
