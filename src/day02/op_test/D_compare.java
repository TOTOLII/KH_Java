package day02.op_test;

public class D_compare {

	
	/*
	 * 비교 연산자( = 관계 연산자)
	 * --> 두개의 값을 비교하는 연산자 
	 * 
	 * 해당 조건을 만족하면 true,
	 * 만족하지 않으면 false 
	 * 
	 * == : ex) A == B : A와 B의 값이 같다.
	 * != : ex) A != B : A와 B는 다르다.
	 * >  : ex) A > B : A는 B보다 크다.
	 * <  : ex) A < B : A는 B보다 작다.
	 * >= : ex) A >= B : A는 B보다 크거나 같다. ( B 이상이다.) 
	 * <= : ex) A <= B : A는 B보다 작거나 같다. ( B 이하다.)
	*/
	
	public void testMethod() {
		
		int a = 10, b = 20; //이렇게 적어도 가능함.
		boolean result1, result2, result3;
		
		result1 = (a == b); //false
		result2 = (a < b); //true
		result3 = (a < b); //false
		
		System.out.println("reulst1 : " + result1);
		System.out.println("reulst2 : " + result2);
		System.out.println("reulst3 : " + result3);
	}
}
