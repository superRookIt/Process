import java.util.Scanner;

public class Ex0217_05 {

	public static void main(String[] args) {
		// 번호 제목 내용 작성자 조회수
		// 1개 입력후 모두 출력
		// 2개 입력후 모두 출력

		Scanner scan = new Scanner(System.in);

		Board[] ge = new Board[10];
		String[] sub = { "번호", "제목", "내용", "작성자", "조회수" };
		int b_num = 0;
		int v_num = 0;

		for (int i = 0; i < ge.length; i++) {
			ge[i] = new Board();
			System.out.println("[ 게시판 글 등록 ]");
			ge[i].number = b_num + 1; // 초기화 번호 - 자동번호
			System.out.println("제목을 입력하세요. >>");
			ge[i].title = scan.nextLine(); // nextLine()은 띄어쓰기 하고 난 뒤에 것도 인식함 !! 엔터전까지
			// scan.nextLine(); -> next()만 했을때 밑에 추가해주기!!
			System.out.println("내용을 입력하세요");
			ge[i].message = scan.nextLine();
			// scan.nextLine();
			System.out.println("작성자를 입력하세요");
			ge[i].writer = scan.nextLine();
			// scan.nextLine();
			ge[i].view = v_num; // 조회수 초기화!
			b_num++;// 글번호 자동증가

			System.out.println("-----------------");
			System.out.println(" [ 글 리스트 출력 ] ");
			System.out.println("-----------------");

			for (int j = 0; j < sub.length; j++) {
				System.out.print(sub[j] + "\t");
			}

			System.out.println(); //

			for (int t = 0; t < b_num; t++) {
				ge[t].print();
				System.out.println();

			}

			System.out.println();

		}

	}// main

}// class
