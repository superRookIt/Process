
public class Student {

	int count=1000; //1001, 1002, 1003
	int hak_num;
	String name;
	int grade;

	{
		count++;
		hak_num = count;

	}// �ʱ�ȭ ��

	Student() {

	}// �⺻ ������

	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;

	}

}
