
public class Ex0304_02 {
	public static void main(String[] args) {

		People p1 = new People(10001);
		People p2 = new People(10001);

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

	}// main

}// class

class People {

	int stu_number;

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof People) {
			People p = (People) obj;
			return stu_number == p.stu_number;
			 // p1.equals(p2)의 경우 p1의 stu_number == p2<p>.stu_number;
		}

		return false;

	}

	People() {

	}

	People(int stu_number) {
		this.stu_number = stu_number;
	}

}
