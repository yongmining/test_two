package test_two_test;

public class test1 {

	public static void main(String[] args) {
		/*
		당신의 나이는 O세 입니다. 밑에 방식으로 만드시오.
		1. 전달인자로 값 전달 테스트
		2. 변수에 저장한 값 전달 테스트
		3. 자동형변환을 이용해서 값 전달 테스트 (byte로 만드시오)
		4. 강제형변환을 이용해서 값 전달 테스트 (long형을 int형으로)
		5. 연산 결과를 이용해서 값 전달 테스
		*/
		test1 app1 = new test1();
		
		/* 1. 전달인자로 값 전달 테스트*/
		app1.testMethod(31);
		
		/* 2. 변수에 저장한 값 전달 테스트 */
		int age = 31;
		app1.testMethod(age);
		
		/* 3. 자동형변환을 이용해서 값 전달 테스트*/
		byte byteAge = 31;
		app1.testMethod(byteAge);
		
		/* 4. 강제형변환을 이용해서 값 전달 테스트 */
		long longAge = 30;
		app1.testMethod((int) longAge);
		
		/* 5. 연산 결과를 이용해서 값 전달을 할 수 있다. */
		app1.testMethod(age*2);
		
		}
		
		public void testMethod(int age) {
			System.out.println("당신의 나이는 " + age + "세 입니다.");
		}
		

}
