
public class Ex0228_01 {

	public static void main(String[] args) {

		Child c1 = new Child();
		Parent p1 = new Parent();
		Parent p2 = new Child();// ->������

		System.out.println("Parent ��ü, �������� �� : " + p1.x);
		p1.method();
		System.out.println("----------------------");
		System.out.println("Child ��ü, �������� �� : " + c1.x);
		c1.method();
		System.out.println("----------------------");
		System.out.println("Child ��ü, �������� �� : " + p2.x);
		p2.method();

	}// main

}// class

class Parent {
	int x = 100;

	void method() {
		System.out.println("�θ� Ŭ���� �޼ҵ� �Դϴ�");
	}

}

class Child extends Parent {

	int x = 200;

	void method() {
		System.out.println("�ڼ� Ŭ���� �޼ҵ� �Դϴ�");
	}// �������̵�

	void method(int x) {
		System.out.println("�ڼ� Ŭ���� �޼ҵ�2�Դϴ�");
	}// �����ε�

}
