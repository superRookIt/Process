
public class Tv {

	String color; // tv의 색상
	boolean power; // 전원
	int channel; // 채널

	void power() { //메소드에는 ()[괄호] 가 꼭 붙음, 변수는 ()가 안붙음 ^^...
		if (power == true) {// 파워on인 상태
			System.out.println("전원을 off 합니다");
			power = !power;
		} else {
			System.out.println("전원을 on 합니다");
		}
	}

	void channelup() { //void는 return값이 없음
		System.out.println("채널을 1증가합니다");
		channel++;
		System.out.println("현재채널 : " + channel);
	}

	void channeldown() {
		System.out.println("채널을 1감소합니다");
		channel--;
		System.out.println("현재채널 : " + channel);
	}

}
