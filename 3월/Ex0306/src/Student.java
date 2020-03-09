
public class Student {

	int hak;
	String name;
	int total;

	Student() {

	}

	Student(int hak, String name, int total) {
		this.hak = hak;
		this.name = name;
		this.total = total;
	}

	public String toString() {
		return "학번 : " + hak + " , 이름 : " + name + " , 합계 " + total;
	}

}
