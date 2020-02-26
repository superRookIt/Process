
public class Ex0218_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		d.x = 10;
		Data.y = 50;

		System.out.println("1번째 d.x : " + d.x);

		// - 클래스 메소드
		// 클래스명.변수명
		// 같은 클래스 내에서는 클래스명 생략 가능!
		// Ex0218_03.change(d.x);

		int dx = change(d); // Date의 주소값을 보냄

		System.out.println("2번째 dx : " + dx);
		System.out.println("2번째 d.x : " + d.x);

	}// main

	static int change(Data d) {// void는 리턴값 x, int는 리턴값 o
		d.x = d.x + 200; // 지역변수 , 210 = 10+200
		return d.x;
	} //

}// class
