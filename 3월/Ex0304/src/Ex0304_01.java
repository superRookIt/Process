
public class Ex0304_01 {

	public static void main(String[] args) {

		Person p1 = new Person(888801011105519L); // long이니까 끝에 L붙이기 ★★
		Person p2 = new Person(888801011105519L); // long이니까 끝에 L붙이기 ★★
		
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);

		System.out.println("주소값 비교 :" + (p1 == p2)); // (p1 == p2) 괄호로 묶어주기 !!
		// false가 나옴! p1, p2 둘다 값은 똑같지만 <주소값>이 달라서 !

		System.out.println("equals로 비교결과 : " + p1.equals(p2));

		// toString 안하면,
		// p1 : Person@15db9742
		// p2 : Person@6d06d69c

	} // main

}// class

class Person {

	long id; // 인스턴스 변수

	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Person) { // (!=)
			return id == ((Person) obj).id; // ★★★★★
		} else {
			return false;
		}
	}

	// 생성자
	Person() {

	}

	Person(long id) {
		this.id = id;
	}

	public String toString() { // ★★★★★
		return "변수 값 : " + id;
	}

}
