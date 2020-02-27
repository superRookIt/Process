import java.util.Scanner;

public class Ex0226_06 {

	public static void main(String[] args) {

		// 시,분,초 을 입력을 받아서 출력을 해보세요
		Scanner scan = new Scanner(System.in);

		Time1 t = new Time1();
		Time1 t2 = new Time1(12, 12, 12);
		t.setHour(10);
		t.setMinute(65);
		t.setSecond(12);
		int a, b, c = 0;

		System.out.println(t);
		System.out.println(t2);

		while (true) {

//			Time1 t3 = new Time1();

			System.out.println("시를 입력하세요");
			a = scan.nextInt();
			if (!(t.setHour(a))) { //★★★★★
				continue;
			}
			System.out.println("시간이 입력되었습니다");
			break;
		}

		//왜 안돼지?? ㅠㅠ.....
//		while (true) {
//			Time1 t3 = new Time1();
//
//			System.out.println("시를 입력하세요");
//			a = scan.nextInt();
//			scan.nextLine();
//			if (a < 0 || a > 12) {
//				System.out.println("잘못된 값을 입력하셨습니다");
//				continue;
//			} else {
//				t3.setHour(scan.nextInt());
//			}
//
//			System.out.println("분을 입력하세요");
//			b = scan.nextInt();
//			if (b > 60 || b < 0) {
//				System.out.println("잘못된 값을 입력하셨습니다");
//				continue;
//			} else {
//				t3.setMinute(scan.nextInt());
//			}
//
//			System.out.println("초을 입력하세요");
//			c = scan.nextInt();
//			if (b > 60 || b < 0) {
//				System.out.println("잘못된 값을 입력하셨습니다");
//				continue;
//			} else {
//				t3.setSecond(scan.nextInt());
//			}
//
//			System.out.println(t3);
//		}

	} // main

}// class

class Time1 {

	private int hour;
	private int minute;
	private int second;

	Time1() {
		this(1, 1, 1);
	}

	Time1(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public boolean setHour(int hour) {
		if (hour < 0 || hour > 24) {
			System.out.println("잘못된 시간이 들어왔습니다.");
			return false;
		}
		this.hour = hour;
		return true;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 60) {
			System.out.println("잘못된 분이 들어왔습니다");
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 60) {
			System.out.println("잘못된 초가 들어왔습니다");
			return;
		}
		this.second = second;
	}

	public String toString() {
		return hour + "시 " + minute + "분 " + second + "초";
	}
}
