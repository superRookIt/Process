
public class Student {

	static int count;
	String name;
	int haknum;
	int kor;
	int eng;
	int total;
	double avg;
	int rank;

	{
		haknum = ++count;

	}

	Student() {

	} // 기본 생성자

	Student(String name, int kor, int eng) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = kor + eng;
		this.avg = total / 2;

	} // 매개변수가 있는 생성자

}
