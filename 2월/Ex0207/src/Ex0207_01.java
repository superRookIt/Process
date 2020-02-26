import java.util.Scanner;

public class Ex0207_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 태어난 월을 확인해서 12,1,2 ==> 겨울 , 3,4,5==>봄, 6,7,8 ==>여름, 9,10,11 =>겨울
		// 주민번호를 입력받아서
		// 1. switch문으로
		// 2. if문

		Scanner scan = new Scanner(System.in);
		String b = ""; // 주민번호 입력변수
		String c = ""; // substring 2자리
		int d = 0; // 실제 월

		System.out.println("주민등록번호를 입력해주세요");
		b = scan.nextLine();
		c = b.substring(2, 4); // substring(시작점, 끝지점)
		d = Integer.parseInt(c); // (숫자로 치환)

//		switch (d) {
//
//		case 3:
//		case 4:
//		case 5:
//			System.out.println(d+"월");
//			System.out.println("당신은 봄에 태어났군요");
//			break;
//
//		case 6:
//		case 7:
//		case 8:
//			System.out.println(d+"월");
//			System.out.println("당신은 여름에 태어났군요");
//			break;
//
//		case 9:
//		case 10:
//		case 11:
//			System.out.println(d+"월");
//			System.out.println("당신은 가을에 태어났군요");
//			break;
//
//		case 12:
//		case 1:
//		case 2:
//			System.out.println(d+"월");
//			System.out.println("당신은 겨울에 태어났군요");
//			break;

		if (d == 12 || d == 1 || d == 2) {
			System.out.print(d + "월");
			System.out.println("당신은 겨울에 태어났군요");
		}
		if (d == 3 || d == 4 || d == 5) {
			System.out.print(d + "월");
			System.out.println("당신은 봄에 태어났군요");
		}
		if (d == 6 || d == 7 || d == 8) {
			System.out.print(d + "월");
			System.out.println("당신은 여름에 태어났군요");
		}
		if (d == 9 || d == 10 || d == 11) {
			System.out.print(d + "월");
			System.out.println("당신은 가을에 태어났군요");
		}

		// ★★★★★ c = b.substring(2,4); // substring(시작점, 끝지점) ★★★★★

	} // main

} // class
