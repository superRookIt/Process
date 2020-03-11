
public class Student {

	static int count = 0;
	int hak;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int avg;
	int rank = 1;

	{

		hak = ++count;

	}

	Student() {
	}

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + math + eng;
		this.avg = total / 3;

	}

	public String toString() {
		return "[학번 : " + hak + "] [이름 : " + name + "] [국어점수 : " + kor + "] [영어점수 : " + eng + "] [수학점수 : " + math
				+ "] [합계 : " + total + "] [평균 : " + avg + "]";
	}
}
