
public class Student {

	int count=1000; //1001, 1002, 1003
	int hak_num;
	String name;
	int grade;

	{
		count++;
		hak_num = count;

	}// 초기화 블럭

	Student() {

	}// 기본 생성자

	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;

	}

}
