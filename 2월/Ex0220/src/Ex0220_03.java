public class Ex0220_03 {

	public static void main(String[] args) {

		Plus p = new Plus();
		p.x = 10;
		p.y = 20;
		p.z = 30;

		p.x = add(p.x, p.y, p.z);
		add_(p);

		System.out.println("x+y+z�� �� : " + p.x);

	} // main

	// return���� �޾Ƽ�
	static int add(int a, int b, int c) {
		int result = 0;
		result = a + b + c;
		return result;
	}

	// ���Ͼ��� �ּҰ��� �޾Ƽ�
	static void add_(Plus p) {
		p.x = p.x + p.y + p.z;
	}

}// class

class Plus { // Ŭ���� �տ� �빮�� ^^;;
	int x;
	int y;
	int z;
}
