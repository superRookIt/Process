import java.util.Scanner;

public class EX0212_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 12��
		String[] ganji = {"��","��","ȣ����","�䳢","��","��",
				          "��","��","������","��","��","����" };		
		

		String[] one = {"��","��","��","��","��","��",
		          "��","��","��","��","��","��" };	
		//�� �� �� �� �� �� �� �� �� �� �� ��
		
		String put = "";
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		int count = 0;
		
		while (count<12) {

			System.out.println("���������� �Է����ּ���");
			put = scan.next();
			
			for (int j = 0; j < one.length; j++) {
				if (put.equals(one[j]) ) { // �ڡڡڡڡ�  equals()
					System.out.println(put+"��(��) �������ſ��� "+(j+1)+"."+ganji[j]+"�� �ش�˴ϴ�");
				}
			}
		
			count++;
			
		}//while
		
//		
//		System.out.println("------------------------");
//		System.out.println("1~12������ ���ڸ� �Է��ϼ���. >>");
//		select = scan.nextInt();
//		
//		System.out.println(select+"��° ���? "+(ganji[select-1])+"("+(one[select-1])+")");

		
		
		
	}//main

}//class
