
public class Ex0211_03 {

	public static void main(String[] args) {

		// �������� ���
		
		// % ������, / ��

		for (int i = 2; i <= 9; i++) {
			if(!(i%2==0)) {
				continue;
				}
			System.out.print(" [ "+i+ " ��] \t");

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
			System.out.println(); // ����Ű
			
			}
		

	}// main

}// class
