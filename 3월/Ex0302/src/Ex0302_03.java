import java.util.*; //★★★

//import java.util.ArrayList;
//import java.util.Scanner;

public class Ex0302_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		Stu_info stu = new Stu_info();

		ArrayList<Stu_info> stu1 = new ArrayList<Stu_info>();

		int i = 0;

		String name = "";
		String major = "";
		int grade = 0;
		String tel = "";

		while (i < 3) {
			System.out.println("1) 학생정보입력 2)출력 3)검색");
			int num = scan.nextInt();

			switch (num) {

			case 1:

				System.out.println("이름을 입력하세요. >> (이전화면 : 99)");
				name = scan.next();

				if (name.equals("99")) {
					System.out.println("이전화면으로 돌아갑니다.");
					break;
				}

				System.out.println("학과를 입력하세요");
				major = scan.next();
				System.out.println("학년을 입력하세요");
				grade = scan.nextInt();
				System.out.println("전화번호를 입력하세요");
				tel = scan.next();
				// 객체에 넣기
				stu1.add(new Stu_info(name, major, grade, tel)); // add
				i++;

				break;

			case 2:

				System.out.println("출력합니다");

				if (stu1.isEmpty()) {
					System.out.println("데이터가 없습니다");
					break;
				}

				for (int j = 0; j < stu1.size(); j++) {

					Stu_info fo = (Stu_info) stu1.get(j); // get
					// ★★★★★ (많이 어렵다;;), toString 처럼
					// System.out.println(stu1.get(1)); -> 찍으면 @주소값이 나옴 !!

					System.out.print(fo.hack_num + "\t");
					System.out.print(fo.name + "\t");
					System.out.print(fo.major + "\t");
					System.out.print(fo.grade + "\t");
					System.out.print(fo.tel + "\t");
					System.out.println();
				}

				break;

			case 3:

				System.out.println("검색할 이름을 입력하세요.");
				String name2 = scan.next();

				for (int j = 0; j < stu1.size(); j++) {

					Stu_info info = (Stu_info) stu1.get(j);

					if (name2.equals(info.name)) {
						System.out.println("찾는 학생은");
						System.out.println(info.hack_num + "\t" + info.name + "\t" + info.major + "\t" + info.grade);
					}

				} // for j

				break;

			}// switch

		} // while

	}// main

}// class
