import java.util.Scanner;

public class Ex0207_04 {
	public static void main(String[] args) {

		// �α���
		// �α����� 5���̻� ���н� ���α׷� ����
		// for 1~���ϴ� ���ڱ��� ���� ���ϴ� ���α׷�

		String id = "aaaa";
		String pass = "12345";
		int fail = 1;
		int i = 0;
		int i1 = 0;
		int sum = 0;

		Scanner scan = new Scanner(System.in);

		loop1: while (true) {

			while (true) {

				if (fail > 5) {
					System.out.println("5�� �Է¿� �����Ͽ����ϴ� ^^ �����մϴ�");
					break loop1;
				}

				System.out.println("id�� �Է����ּ���");
				String id1 = scan.nextLine(); // next -> ���̶��⳪ ����Ű�������� ���� �ɴϴ�, nextline -> ������ ���� ��
                                              // abc def = next��  abc , nextline��  abcdef ������
				if (!(id.equals(id1))) {
					System.out.println("id�� ��ġ���� �ʽ��ϴ�. "+fail+"ȸ ����");
					fail++;
					continue;
				}
				break;
			}

			while (true) {

				if (fail > 5) {
					System.out.println("5�� �Է¿� �����Ͽ����ϴ� ^^ �����մϴ�");
					break loop1;
				}
				
				System.out.println("password�� �Է����ּ���. >>");
				String pass_ch = scan.next();

				if (!(pass.equals(pass_ch))) {
					System.out.println("pass�� ��ġ���� �ʽ��ϴ�"+fail+"ȸ ����");
					fail++;
					continue;
				}
				break;
			}

			System.out.println("1���� ����� ���Ұ̴ϱ�?");
			i = scan.nextInt();

			for (i1 = 1; i1 <= i; i1++) {
				sum += i1;
			}

			System.out.println("�� ���� �ٷ� " + sum);
			System.out.printf("1���� %d������ ���� : %d",i,sum);
			
			break;

		} // while

	}// main
}// class
