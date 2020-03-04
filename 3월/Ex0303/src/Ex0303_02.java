
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
		System.out.println("methodA 메소드 호출");
		i.methodB();
	}

}

class B implements I {

	public void methodB() {
		System.out.println("methodB 메소드 호출 ");
	}

}

class C implements I {

	public void methodB() {
		System.out.println("methodB 메소드 호출  in C");
	}

}
