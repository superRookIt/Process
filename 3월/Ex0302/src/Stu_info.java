
public class Stu_info {

	// �л�����
	// 1. �й� hack_num, �̸� - name, �а�-major, �г�-grade, ��ȭ tel

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
