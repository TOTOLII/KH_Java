package day02.op_test;

public class A_adder_01 {
	
	//	++ : +1의 의미를 지닌 연산자
	//	-- : -1의 의미를 지닌 연산자
	//	
	//	단일로 사용할 경우 값 자체 증가(감소)의 의미를 지니고,
	//	어느 위치에서 연산을 수행해도 ( ++a / a++ )
	//	같은 결과가 나온다.
	
	public void testMethod1() {
		int num = 100; //stack 메모리에 할당.
		System.out.println("현재 num의 숫자는 ? " + num);
		
		++num; //증감 연산자가 앞에 붙어서 전위 연산자라고 한다. cpu를 거치지 않기 때문에 훨씬 빠름.
		System.out.println("현재 num의 숫자는 ? " + num);
		
		num++; //증감 연산자가 뒤에 붙어서 후위 연산자라고 한다.
		System.out.println("현재 num의 숫자는 ? " + num);
		
		// num = num + 1; 메모리 안에 들어있는데 이를 연산 시키면, 
		// cpu로 할당되어 계산 한 뒤 메모리로 다시 오기 때문에 증감 연산자보다 훨씬 느림.
		
		--num;
		System.out.println("현재 num의 숫자는 ? " + num);
		
		num--;
		System.out.println("현재 num의 숫자는 ? " + num);
	}
	
	public void testMethod2() {
		// 다른 연산이 연관될 경우 증감 연산자 차이점
		
		int num = 10;
		int result1 = ++num + 3;
		// 전위 연산자 : 어떠한 연산을 함꼐 수행할 때,
//					   현재 전위 연산을 먼저 수행하겠다.
		// 접속자를 측정할 때 사용
		
		System.out.println("result1 :" + result1);
		System.out.println("num : " + num);
		
		System.out.println("====================================");
		
		int num2 = 10;
		int result2 = num2++ + 3;
		// 후위 연산자 : 어떠한 연산을 함계 수행할 때에
		//		   	   다른 연산을 먼저 수행하고, 자신을 나중에 수행하는 연산자
		// 			   게시판 조회수를 할때 사용
		System.out.println("result2 :" + result2);
		System.out.println("num2 : " + num2);
		
	}
}
