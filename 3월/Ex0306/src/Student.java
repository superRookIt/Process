
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
		return "�й� : " + hak + " , �̸� : " + name + " , �հ� " + total;
	}

}
