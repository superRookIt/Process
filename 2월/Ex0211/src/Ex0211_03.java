
public class Ex0211_03 {

	public static void main(String[] args) {

		// 구구단을 출력
		
		// % 나머지, / 몫

		for (int i = 2; i <= 9; i++) {
			if(!(i%2==0)) {
				continue;
				}
			System.out.print(" [ "+i+ " 단] \t");

		}
		
		System.out.println();

		for (int i = 1; i < 10; i++) {
			if(!(i%3==0)) {
				continue;
				}
			for (int j = 2; j < 10; j++) {
				if(!(j%2==0)) {
					continue;
					}
				System.out.printf(j + " x " + i + " = " + i * j + " / ");
			}
			System.out.println(); // 엔터키
			
			}
		

	}// main

}// class
