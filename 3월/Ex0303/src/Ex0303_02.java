
public class Ex0303_02 {

	public static void main(String[] args) {

		A a = new A();
		a.methodA(new C());

	}// main

}// class

interface I {

	void methodB();
}

class A {

	void methodA(I i) {
		System.out.println("methodA �޼ҵ� ȣ��");
		i.methodB();
	}

}

class B implements I {

	public void methodB() {
		System.out.println("methodB �޼ҵ� ȣ�� ");
	}

}

class C implements I {

	public void methodB() {
		System.out.println("methodB �޼ҵ� ȣ��  in C");
	}

}
