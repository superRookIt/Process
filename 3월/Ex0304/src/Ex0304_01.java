
public class Ex0304_01 {

	public static void main(String[] args) {

		Person p1 = new Person(888801011105519L); // long�̴ϱ� ���� L���̱� �ڡ�
		Person p2 = new Person(888801011105519L); // long�̴ϱ� ���� L���̱� �ڡ�
		
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);

		System.out.println("�ּҰ� �� :" + (p1 == p2)); // (p1 == p2) ��ȣ�� �����ֱ� !!
		// false�� ����! p1, p2 �Ѵ� ���� �Ȱ����� <�ּҰ�>�� �޶� !

		System.out.println("equals�� �񱳰�� : " + p1.equals(p2));

		// toString ���ϸ�,
		// p1 : Person@15db9742
		// p2 : Person@6d06d69c

	} // main

}// class

class Person {

	long id; // �ν��Ͻ� ����

	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Person) { // (!=)
			return id == ((Person) obj).id; // �ڡڡڡڡ�
		} else {
			return false;
		}
	}

	// ������
	Person() {

	}

	Person(long id) {
		this.id = id;
	}

	public String toString() { // �ڡڡڡڡ�
		return "���� �� : " + id;
	}

}
