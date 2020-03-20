import java.util.Scanner;

public class Decktest {

	public static void main(String[] args) {

		Deck d = new Deck();
		System.out.println("카드랜덤 출력");
		Card[] c1 = new Card[5];
		d.shuffle();

		for (int i = 0; i < 5; i++) {
			c1[i] = d.pick(i);
			System.out.println("랜덤출력된 카드 : " + c1[i]);
		}

	}// main

}// class
