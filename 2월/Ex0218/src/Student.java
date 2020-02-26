
public class Student {

	// 학번/이름/국어/영어/수학/합계/평균/등수

	static int first_num = 1000;
	int num;// 1000번대부터 자동 ★
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	void total_() {
		total = kor + eng + math;
	}

	void avg_() {
		avg = kor + eng + math / 3;
	}

}
