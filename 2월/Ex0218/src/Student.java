
public class Student {

	// �й�/�̸�/����/����/����/�հ�/���/���

	static int first_num = 1000;
	int num;// 1000������� �ڵ� ��
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
