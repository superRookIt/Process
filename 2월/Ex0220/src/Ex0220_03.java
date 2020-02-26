public class Ex0220_03 {

	public static void main(String[] args) {

		Plus p = new Plus();
		p.x = 10;
		p.y = 20;
		p.z = 30;

		p.x = add(p.x, p.y, p.z);
		add_(p);

		System.out.println("x+y+z의 합 : " + p.x);

	} // main

	// return값을 받아서
	static int add(int a, int b, int c) {
		int result = 0;
		result = a + b + c;
		return result;
	}

	// 리턴없이 주소값을 받아서
	static void add_(Plus p) {
		p.x = p.x + p.y + p.z;
	}

}// class

class Plus { // 클래스 앞에 대문자 ^^;;
	int x;
	int y;
	int z;
}
