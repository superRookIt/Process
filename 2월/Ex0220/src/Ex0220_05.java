public class Ex0220_05 {

	public static void main(String[] args) {

		int[] d = new int[2]; //배열도 객체 ★

		d[0] = 10;
		d[1] = 100;

		d[0] = change(d);

//		change_(d);

		System.out.println(d[0]);

	}// main

	static int change(int[] d) {
		return d[0] + d[1];
	}

	static void change_(int[] d) {
		d[0] = d[0] + d[1];
	}

}// class
