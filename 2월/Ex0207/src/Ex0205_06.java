import java.util.Scanner;

public class Ex0205_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���Ǳ� ���α׷� <2020.02.07 ���α׷� ������Ʈ>

		String id = "aaa"; // ������ ���̵�
		String pass = "1234"; // ������ �н�����
		String check_id ="";
		String check_pass="";

		int coffe_amount = 100; // Ŀ�����
		int sugar_amount = 50; // �������
		int milk_amount = 70; // �������

		int total_sale = 0; // �� �Ǹŷ�
		int total_price = 0; // �� �Ǹűݾ�
		int order_num = 0; // Ŀ�Ǽ��ù�ȣ
		int input_price = 0; // ���Աݾ�

		final int BLACK_PRICE = 100;
		final int SUGAR_PRICE = 300;
		final int LATTE_PRICE = 200;
		final int MILK_PRICE = 100;
		
		boolean black_check = false;
		boolean sugar_check = false;
		boolean latte_check = false;
		boolean milk_check = false;

		Scanner scan = new Scanner(System.in);

		loop1 : while (true) {

			System.out.println("---------------------------");
			System.out.println("        Ŀ�� ���Ǳ�                           ");
			System.out.println("---------------------------");

			if (black_check == false) {
				System.out.println("1)��Ŀ�� - 100��");
			}
			System.out.println("2)���Ŀ�� - 300��");
			System.out.println("3)ī��� - 200��");
			System.out.println("4)��ũĿ�� - 100��");
			System.out.println("9)������");
			System.out.println("0)�ý��� ����");
			System.out.println("---------------------------");
			System.out.println("���ð� ���� Ŀ�� ��ȣ�� �Է��ϼ���. >>");
			order_num = scan.nextInt();

			switch (order_num) {

			case 1:
				if (!(coffe_amount > 10)) {
					System.out.println("Ŀ�ǰ� �����մϴ�. �����ڿ��� �������ּ���");
					black_check = !(black_check); // false-> true, true->false��
					continue;
				}

				coffe_amount -= 10; // Ŀ����� -10 ����
				total_sale++; // �� �Ǹŷ� 1�� ����
				total_price += 100; // �� �Ǹűݾ� 100�� ����
				input_price -= 100; // ���Աݾ׿��� 100 ����

				System.out.println("��Ŀ�� 1���� ���Խ��ϴ�. ^^");

				break;

			case 2:
				
				if (!(sugar_amount > 10)) {
					System.out.println("Ŀ�ǰ� �����մϴ�. �����ڿ��� �������ּ���");
					sugar_check = !(sugar_check); // false-> true, true->false��
					continue;
				}
				
				break;

			case 3:

				break;

			case 4:

				break;

			case 9:
				
				System.out.println("������ id�� �Է��ϼ��� ^^");
				check_id = scan.next();
				
				if(!(id.equals(check_id))) {
					System.out.println("id�� ��ġ���� �ʽ��ϴ� ^^ ");
					continue;
				}

				System.out.println("coffe_amount �� :" + coffe_amount);
				System.out.println("sugar_amount �� :" + sugar_amount);
				System.out.println("milk_amount �� :" + milk_amount);
				System.out.println("total_sale �� :" + total_sale);
				System.out.println("total_price �ݾ� :" + total_price);

				break;

			case 0:
				System.out.println("�ý����� �����մϴ�.");
				break;

			default:
				System.out.println("�ý��� �����Դϴ� ^^");
				break;
				
				

			}// switch

			
			
			
		} // while loop1

	}// main

}// class
