
public class Tv {

	String color; // tv�� ����
	boolean power; // ����
	int channel; // ä��

	void power() { //�޼ҵ忡�� ()[��ȣ] �� �� ����, ������ ()�� �Ⱥ��� ^^...
		if (power == true) {// �Ŀ�on�� ����
			System.out.println("������ off �մϴ�");
			power = !power;
		} else {
			System.out.println("������ on �մϴ�");
		}
	}

	void channelup() { //void�� return���� ����
		System.out.println("ä���� 1�����մϴ�");
		channel++;
		System.out.println("����ä�� : " + channel);
	}

	void channeldown() {
		System.out.println("ä���� 1�����մϴ�");
		channel--;
		System.out.println("����ä�� : " + channel);
	}

}
