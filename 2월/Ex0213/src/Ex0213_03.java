import java.util.Scanner;

public class Ex0213_03 {

	public static void main(String[] args) {

		int[] num = {1,2,3,4,5};
		int[] num2= new int[10];
		
		System.arraycopy(num, 0, num2, 5, num.length);
		
		//num �迭 ���
		for(int i=0; i<num.length;i++) {
		System.out.print(num[i]+" ");
		}
		
		System.out.println();
		
		//num2 �迭 ���
		for(int i=0; i<num2.length;i++) {
		System.out.print(num2[i]+" ");
		}
		
		
		
//		//�迭����
//		for(int i =0;i<num.length;i++) {
//			num2[i]=num[i];
//		}
//		
//		//num �迭 ���
//		for(int i=0; i<num.length;i++) {
//		System.out.print(num[i]+" ");
//		}
//		
//		System.out.println();
//		
//		//num2 �迭 ���
//		for(int i=0; i<num2.length;i++) {
//		System.out.print(num2[i]+" ");
//		}
//		
//		
//		

//		Scanner scan = new Scanner(System.in);

//		while (true) {
//			for(int i=0;i<4;i++) {
//				System.out.println("���� �Է��ϼ���. >>");
//				num[i]=scan.nextInt();
//			
//			System.out.println("�Է°� : "+num[i]);
//			}
//			
//		}

	}// main

}// class
