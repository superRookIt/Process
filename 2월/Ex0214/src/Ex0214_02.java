
public class Ex0214_02 {

	public static void main(String[] args) {

		// ���� ~ 1428548419
		// 1. 10���� �迭�� �����.
		// 2. �� �������� 0~9���� ���ڸ� �ִ´�.
		// 3. ù��°�� �ι�° �� �ڸ��ٲ�, �ι�°�� ����° �� �ڸ��ٲ�
		// 4. �������� üũ
		// 5. ���

		int[] arr1 = new int[10];
		int temp = 0; // �ӽ�����
		boolean check = false; // �ڸ����� üũ����

		// �迭�� 0~9
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 10);
		}

		System.out.print("ó�� �迭 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}

		System.out.println();

		// ù��°, �ι�° ���� �ڸ� �ٲ�
		for (int i = 0; i < arr1.length; i++) {
			check = false;
			for (int j = 0; j < arr1.length - 1 - i; j++) { // �ڡڡڡڡ� arr1.length -1 - i, �񱳴� 9�� �ڡڡڡڡ�
				if (arr1[j] > arr1[j + 1]) { // ��
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
					check = true;// if�� �������� ! �ڡ�
				}

			} // for j

			System.out.print((i + 1) + "��° ���� : " + "\t");
			// �ѹ��� ���� ���
			for (int k = 0; k < arr1.length; k++) {
				System.out.print(arr1[k] + "\t");
			}

			System.out.println();

			if (check == false) {
				System.out.println("��� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			}

		} // for i

		// ���
		System.out.print("���� ���� : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}

	}// main

}// class
