package ch07_클래스;

public class A {
	int num1;
	int num2;
	
	void test1( ) {
		System.out.println("테스트1 함수호출");
	}
	
	void test2(int x, int y) {
		System.out.println("x 값: " + x);
		System.out.println("y 값: " + y);
	}
	
	void test3() {
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}
