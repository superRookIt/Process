
public class Ex0220_04 {

	public static void main(String[] args) {

		Arith a = new Arith();
		int[] r = new int[4];

		a.x = 50;
		a.y = 10;
		a.z = 2;

		int add = 0;
		int sub = 0;
		int mul = 0;
		double div = 0;

		add = add(a.x, a.y, a.z);
		sub = sub(a.x, a.y, a.z);
		mul = mul(a.x, a.y, a.z);
		div = div(a.x, a.y, a.z);

		rule(r, a.x, a.y, a.z);

		add = r[0];
		sub = r[1];
		mul = r[2];
		div = r[3];

//		a.result = add(a.x, a.y, a.z);
//		a.result2 = sub(a.x, a.y, a.z);
//		a.result3 = mul(a.x, a.y, a.z);
//		a.result4 = div(a.x, a.y, a.z);

//		add_(a);
//		sub_(a);
//		mul_(a);
//		div_(a);

//		System.out.println("결과값 : " + a.result);
//		System.out.println("결과값 : " + a.result2);
//		System.out.println("결과값 : " + a.result3);
//		System.out.println("결과값 : " + a.result4);

		System.out.println();

		System.out.println("결과값 : " + add);
		System.out.println("결과값 : " + sub);
		System.out.println("결과값 : " + mul);
		System.out.println("결과값 : " + div);

	}// main

	static void rule(int[] r, int a, int b, int c) { // 배열은 리턴이 없어도 값을 저장 ^^
		r[0] = a + b + c;
		r[1] = a - b - c;
		r[2] = a * b * c;
		r[3] = a / b / c;
	}

	static int add(int a, int b, int c) {
		int result = 0;
		result = a + b + c;
		return result;
	}

	static void add_(Arith a) {
		a.result = a.x + a.y + a.z;
	}

	static int sub(int a, int b, int c) {
		int result = 0;
		result = a - b - c;
		return result;
	}

	static void sub_(Arith a) {
		a.result2 = a.x - a.y - a.z;
	}

	static int mul(int a, int b, int c) {
		int result = 0;
		result = a * b * c;
		return result;
	}

	static void mul_(Arith a) {
		a.result3 = a.x * a.y * a.z;
	}

	static double div(int a, int b, int c) {
		double result = 0;
		result = (double) a / b / c;
		return result;
	}

	static void div_(Arith a) {
		a.result4 = (double) a.x / a.y / a.z;
	}

}// class

class Arith {
	int x;
	int y;
	int z;
	int result;
	int result2;
	int result3;
	double result4;
}