
public class Ex0225_02 {

	public static void main(String[] args) {

		Student[] stu = new Student[3];
		String[] name = new String[] { "홍길동", "이순신", "김유신" }; // 정식
		int[] grade = { 3, 4, 1 }; // 양식 ^^

		stu[0] = new Student(name[0], grade[0]);
		stu[1] = new Student(name[1], grade[1]);
		stu[2] = new Student(name[2], grade[2]);

		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student(name[i], grade[i]);
		}

		int[] lotto_ = new int[45];

		for (int i = 0; i < lotto_.length; i++) {
			lotto_[i] = i + 1;
		}

		Lotto lotto = new Lotto();

		for (int i = 0; i < 45; i++) {
			System.out.println(lotto.lo[i]);
		}

	}

}
