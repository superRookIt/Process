
public class Stu_info {

	// 학생정보
	// 1. 학번 hack_num, 이름 - name, 학과-major, 학년-grade, 전화 tel

	static int count1;
	int hack_num;
	String name;
	String major;
	int grade;
	String tel;

	{
		hack_num = count1++;
	}

	Stu_info() {

	}

	Stu_info(String name, String major, int grade, String tel) {
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.tel = tel;

	}

//	public String toString() {
//         return
//	}

}
