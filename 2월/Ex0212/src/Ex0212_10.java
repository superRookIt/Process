import java.util.Scanner;

public class Ex0212_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 게시판 프로그램
		// 번호(1)-int 이름 제목 글내용 -String 조회수 - int
		// 10개까지 입력이 가능한데..1개만 하고 물어보기(더 입력, 아니면 멈출지)

		// 1)홍길동 게시판완성 게시판이 완성되었습니다 0
		//next()-> 띄어쓰기나 엔터 전까지 입력 / nextLine()-> 한줄 모두 입력
		// 2)이순신 프로그램질문 프로그램 질문이 있습니다 0

		// 2개까지 입력해서 출력하시오

		// 옵션>
		// 1개 입력 후 물어보기
		// 입력,출력

		// -> 1)글쓰기 2)목록 - 리스트 1)읽기 2)수정 3)삭제

		Scanner scan = new Scanner(System.in);

		String[] name = {"번호", "이름", "제목", "글내용", "조회수"};

		int[] a = new int [5];
		String[] b = new String[5];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("게시판 번호를 입력해 주세요");
			a[i]=scan.nextInt();
			System.out.println("이름을 입력해주세요");
			b[i]=scan.next();
			
		}
		
		
		for (int i=0;i<b.length;i++){
			System.out.print(name[i]+"\t");
		}
		
		System.out.println();
		
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
			for(int j=0;j<a.length;j++) {
			System.out.print(b[j]+"\t");
			} //for j
			
			System.out.println();
			
		}// for i

		
		
	}// main
}// class
