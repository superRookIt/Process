
public class Ex0303_05 {
	public static void main(String[] args) {

		Exception e_one = new Exception();

		try {

			StartInstall();
			CopyFile();
			System.out.println(5 / 0);
//			DeleteTempFile();

		} catch (Exception e) {

			e.printStackTrace();
//			DeleteTempFile();
			System.out.println("catch ������ ���� �Ǿ����ϴ�");

		}

		finally {
			// DeleteTempFile()�� try, catch �Ѵ� ���������� ���ϱ�
			// finally�� �ѹ��� �־��ֱ�

			DeleteTempFile();
			System.out.println("finally ������ ���� �Ǿ����ϴ�");

		}

	}// main

	static void StartInstall() {
		System.out.println("���α׷��� ��ġ�մϴ�. >> install ����");
	}

	static void CopyFile() {
		System.out.println("�ű����α׷��� �����մϴ�. >> copy ����");
	}

	static void DeleteTempFile() {
		System.out.println("�����ߴ� �ӽ������� �����մϴ�. >> delete ����");
	}

}// class
