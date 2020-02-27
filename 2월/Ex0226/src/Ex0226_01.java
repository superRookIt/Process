
public class Ex0226_01 extends Object {

	Ex0226_01() {
		super();
	}

	public static void main(String[] args) {

		Child c = new Child();
		c.method();

	}// main

}// class

class Parent extends Object {
	int x = 20;

	Parent() {
		super();

	}

}

class Child extends Parent {
	int x = 50;

	Child() {
		super();
	}

	void method() {
		int x = 100;
		System.out.println("local X : " + x);
		System.out.println("인스턴스 x : " + this.x);
		System.out.println("조상 x : " + super.x);
	}

}
