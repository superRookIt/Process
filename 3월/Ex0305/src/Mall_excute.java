import java.text.SimpleDateFormat;
import java.util.*;

public class Mall_excute { // 명령어

	static Scanner scan = new Scanner(System.in);

	static Calendar cal = Calendar.getInstance();

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	static void buy(ArrayList m, Product p, ArrayList gm) {

		System.out.println("ID를 입력해주세요");

		String id = scan.next();

		for (int i = 0; i < m.size(); i++) {

			Member m1 = (Member) m.get(i);

			if (m1.id.equals(id)) {

				if (m1.money < p.price) {
					System.out.println("잔액이 부족합니다");
					return;
				}

				m1.money -= p.price;
				m1.point += p.bonus;

				gm.add(p); // gm배열에 구매목록 저장
				int e = gm.indexOf(p);
				m1.serial = e + 1;

				System.out.println(m1.name + " 고객님 !" + p.name + " 구매를 했습니다.");
				System.out.println(p.toString());
				System.out.println("구매시간 : " + sdf.format(cal.getTime()));

			}

		}

	}

	static void summary(ArrayList m, ArrayList gm) {

		System.out.println("ID를 입력해주세요");
		String id = scan.next();

		for (int j = 0; j < m.size(); j++) {

			Member m1 = (Member) m.get(j);

			if (m1.id.equals(id)) {

				if (gm.isEmpty()) {
					// ★★★★★ (cart가 빈 공백인지 아닌지 isEmpty())
					return;
				}

				if (!(m1.serial == 0)) {

					Product p1 = (Product) gm.get(m1.serial);

					m1.sum += p1.price;
					m1.list += p1.name + " ";

				}

				System.out.println("고객 " + m1.name + "님의 아이디 : " + m1.id);
				System.out.println("고객 " + m1.name + "님의 잔액 : " + m1.money);
				System.out.println("고객 " + m1.name + "님의 포인트 : " + m1.point);

				System.out.println("구매하신 목록 : " + m1.list);
				System.out.println("총 구매 금액 : " + m1.sum);

				m1.serial = 0;

			}

		}

	}

}// class
