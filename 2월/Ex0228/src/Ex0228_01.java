
public class Ex0228_01 {

	public static void main(String[] args) {

		Child c1 = new Child();
		Parent p1 = new Parent();
		Parent p2 = new Child();// ->다형성

		System.out.println("Parent 객체, 참조변수 값 : " + p1.x);
		p1.method();
		System.out.println("----------------------");
		System.out.println("Child 객체, 참조변수 값 : " + c1.x);
		c1.method();
		System.out.println("----------------------");
		System.out.println("Child 객체, 참조변수 값 : " + p2.x);
		p2.method();

	}// main

}// class

class Parent {
	int x = 100;

	void method() {
		System.out.println("부모 클래스 메소드 입니다");
	}

}

class Child extends Parent {

	int x = 200;

	void method() {
		System.out.println("자손 클래스 메소드 입니다");
	}// 오버라이딩

	void method(int x) {
		System.out.println("자손 클래스 메소드2입니다");
	}// 오버로딩

}
