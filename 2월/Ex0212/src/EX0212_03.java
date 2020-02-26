import java.util.Scanner;

public class EX0212_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 12개
		String[] ganji = {"쥐","소","호랑이","토끼","용","뱀",
				          "말","양","원숭이","닭","개","돼지" };		
		

		String[] one = {"자","축","인","묘","진","사",
		          "오","미","신","유","술","해" };	
		//자 축 인 묘 진 사 오 미 신 유 술 해
		
		String put = "";
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		int count = 0;
		
		while (count<12) {

			System.out.println("십이지신을 입력해주세요");
			put = scan.next();
			
			for (int j = 0; j < one.length; j++) {
				if (put.equals(one[j]) ) { // ★★★★★  equals()
					System.out.println(put+"은(는) 십이지신에서 "+(j+1)+"."+ganji[j]+"에 해당됩니다");
				}
			}
		
			count++;
			
		}//while
		
//		
//		System.out.println("------------------------");
//		System.out.println("1~12번까지 숫자를 입력하세요. >>");
//		select = scan.nextInt();
//		
//		System.out.println(select+"번째 띠는? "+(ganji[select-1])+"("+(one[select-1])+")");

		
		
		
	}//main

}//class
