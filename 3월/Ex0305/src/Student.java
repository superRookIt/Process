
public class Student implements Comparable<Student> { // �ڡڡ�

	int hak_num;
	String name;
	int total;

	Student() {

	}

	Student(int hak_num, String name, int total) {
		this.hak_num = hak_num;
		this.name = name;
		this.total = total;
	}

	public String toString() {
		return "�й� : " + hak_num + " �̸� : " + name + " �հ�  : " + total;
	}

	@Override
	public int compareTo(Student s) { // �ڡڡ�

		// return this.name.compareTo(s.name);
		// �̸��� �����༭ ������ �ٲ� ������ ������ (������ -1, �Ȱ����� 0, ũ�� 1)

//		if (this.total < s.total) {
//			return -1;
//		} else if (this.total > s.total) {
//			return 1;
//		} else {
//			return 0;
//		} 
		// total�� ��

		if (this.hak_num < s.hak_num) { // ��ȣ�� ���ϰ��� �ٲ��ָ� ����
			return -1;
		} else if (this.hak_num > s.hak_num) {
			return 1;
		} else {
			return 0;
		}
		// hak_num���� ��

	}

}
