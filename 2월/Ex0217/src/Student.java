
public class Student {

	String name; // 이름
	int kor; // 국어
	int eng; // 영어
	int math;// 수학
	int total; // 합계
	double avg; // 평균


	void total() {
		total = kor + eng + math;
	}

	void avg() {
		avg = total / 3;
	}

	
	
	
}
