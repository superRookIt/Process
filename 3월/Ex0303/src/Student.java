
public class Student {

	static int count = 0;
	int hak_num; 
	String name;
	String major; 
	int grade; 

	int kor;
	int eng;
	int total;
	double avg;
	int rank;

	{
		hak_num = ++count;
	}

	Student() {

	}

	Student(String name, String major, int grade) {
		this.name = name;
		this.major = major;
		this.grade = grade;
	}

	void total() {
		total = kor + eng;
	}

	void avg() {
		avg = total / 2;
	}

}
