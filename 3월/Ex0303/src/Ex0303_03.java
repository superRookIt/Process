import java.util.Scanner;

public class Ex0303_03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;

		System.out.println("이름을 입력하세요. >>");
		name = scan.nextLine();
		System.out.println("국어점수 입력하세요. >>");
		kor = scan.nextInt();

		try {

			System.out.println(5 / 0);

		} catch (Exception e) {
			e.printStackTrace();  
			// e.printStackTrace : 어디에서 무슨 에러가 났는지 알려주는 메소드 ★★★★★ !!
		}

		System.out.println("영어점수 입력하세요. >>");
		eng = scan.nextInt();

		System.out.println("---------------");

		System.out.println(1);
		System.out.println(2);

		try { // try -> 컨트롤 + 스페이스
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);

		System.out.println("---------------");

		System.out.println(1);
		System.out.println(2);

		try { // try -> 컨트롤 + 스페이스
			System.out.println(3);
			System.out.println(5 / 0);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);

	}// main

}// class
