
class Stu_01 {

	private static Stu_01 s = new Stu_01();

	private int hack_num;
	private int kor;
	private String name;

	private Stu_01() {

	}// 기본 생성자

	public static Stu_01 Getinstance() {

		if (s == null) {
			s = new Stu_01();

		}
		return s;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getHack_num() {
		return hack_num;
	}

	public void setHack_num(int hack_num) {
		this.hack_num = hack_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "학번 : " + hack_num + " / 이름 : " + name + " / 국어 점수 :" + kor;
	}

}
