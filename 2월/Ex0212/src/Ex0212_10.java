import java.util.Scanner;

public class Ex0212_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �Խ��� ���α׷�
		// ��ȣ(1)-int �̸� ���� �۳��� -String ��ȸ�� - int
		// 10������ �Է��� �����ѵ�..1���� �ϰ� �����(�� �Է�, �ƴϸ� ������)

		// 1)ȫ�浿 �Խ��ǿϼ� �Խ����� �ϼ��Ǿ����ϴ� 0
		//next()-> ���⳪ ���� ������ �Է� / nextLine()-> ���� ��� �Է�
		// 2)�̼��� ���α׷����� ���α׷� ������ �ֽ��ϴ� 0

		// 2������ �Է��ؼ� ����Ͻÿ�

		// �ɼ�>
		// 1�� �Է� �� �����
		// �Է�,���

		// -> 1)�۾��� 2)��� - ����Ʈ 1)�б� 2)���� 3)����

		Scanner scan = new Scanner(System.in);

		String[] name = {"��ȣ", "�̸�", "����", "�۳���", "��ȸ��"};

		int[] a = new int [5];
		String[] b = new String[5];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("�Խ��� ��ȣ�� �Է��� �ּ���");
			a[i]=scan.nextInt();
			System.out.println("�̸��� �Է����ּ���");
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
