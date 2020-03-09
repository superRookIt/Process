
public class Student implements Comparable<Student> { // ★★★

	int hak_num;
	String name;
	int total;

	Student() {

	}

	Student(int hak_num, String name, int total) {
		this.hak_num = hak_num;
		this.name = name;
		this.total = total;
	}

	public String toString() {
		return "학번 : " + hak_num + " 이름 : " + name + " 합계  : " + total;
	}

	@Override
	public int compareTo(Student s) { // ★★★

		// return this.name.compareTo(s.name);
		// 이름을 비교해줘서 순서를 바꿈 ㄱㄴㄷ 순으로 (작으면 -1, 똑같으면 0, 크면 1)

//		if (this.total < s.total) {
//			return -1;
//		} else if (this.total > s.total) {
//			return 1;
//		} else {
//			return 0;
//		} 
		// total로 비교

		if (this.hak_num < s.hak_num) { // 등호나 리턴값을 바꿔주면 역순
			return -1;
		} else if (this.hak_num > s.hak_num) {
			return 1;
		} else {
			return 0;
		}
		// hak_num으로 비교

	}

}
