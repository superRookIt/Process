
public class Ex0303_04 {

	public static void main(String[] args) {

		Exception e = new Exception("���Ƿ� �߻�������");
		System.out.println(1);
		System.out.println(2);
		try {

			throw e;

		} catch (Exception e2) {

			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println();

		}

		System.out.println(3);
		System.out.println("�Ϸ�");

	}// main

}// class
