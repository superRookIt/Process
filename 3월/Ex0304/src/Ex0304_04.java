import java.util.Scanner;

public class Ex0304_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Kard k1 = new Kard(1, "이순신", "구매부서", "부장", 5000000, 120, 10, "02-546-5456");
		Kard k2 = new Kard(2, "홍길동", "총무부서", "대리", 3000000, 60, 5, "054-546-5456");
		Kard k3 = new Kard(3, "권율", "영업부서", "과장", 2000000, 36, 3, "032-546-5456");
		// 3명의 직원을 입력하고 toString을 오버라이딩 해서 출력을 해보세요

		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);

	}// main

}// class

class Kard {

	int id_num;
	String name;
	String department; // 부서
	String positon; // 직책
	int salary; // 월급
	int peroid; // 근무기간
	int v_count; // 연차
	String tel; // 전화번호

	Kard() {

	}

	Kard(int id_num, String name, String department, String positon, int salary, int peroid, int v_count, String tel) {
		this.id_num = id_num;
		this.name = name;
		this.department = department;
		this.positon = positon;
		this.salary = salary;
		this.peroid = peroid;
		this.v_count = v_count;
		this.tel = tel;
	}

	public String toString() {
		return "아이디 번호 : " + id_num + "/ 이름 : " + name + "/ 부서 : " + department + "/ 월급 : " + salary + "/ 근무기간 : "
				+ peroid + "/ 연차 : " + v_count + "/ 전화번호 : " + tel;
	}

}
