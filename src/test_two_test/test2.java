package test_two_test;

public class test2 {

	public static void main(String[] args) {
		/*
		 소지금을 10000원 가지고 있는 상태에서, 가격이 1000원인 사과와 2000원인 바나나를 사려고 한다.
		 
		이때, 소지금에서 '사과를 사고 남은 거스름돈'과 '바나나를 사고 남은 거스름돈'을 각각의 메소드로
		구현하여 작성하라.
		(메소드는 두 개를 사용하고, 둘 모두 main메소드 안에 작성한다.)
		*/
		int cash = 10000;
		int apple = 1000;
		int banana = 2000;
		int change1 = cash - apple;
		int change2 = cash - banana;

		test2 app = new test2();
		app.buyA(change1);
		app.buyB(change2);
	}

	public void buyA(int change1) {

		System.out.println("사과를 사고 남은 거스름돈 : " + change1);

	}

	public void buyB(int change2) {

		System.out.println("바나나를 사고 남은 거스름돈 : " + change2);



	}

}
