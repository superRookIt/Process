
public class Ex0227_02 {

	public static void main(String[] args) {

		TV t = new TV();
		Captiontv c = new Captiontv();
		TV t2 = new Captiontv();
		Captiontv c2 = new Captiontv();

		Captiontv c3 = null;
		TV t3 = new Captiontv();
		c3 = (Captiontv) t3;

		// Captiontv c2= new TV(); ERROR!!

		t2.power();
		t2.channel = 7;
		// t2.caption();

		t2 = c2; // t2 = (TV) c2
		c2 = (Captiontv) t2; // -> �ּҰ� �Ѱ��ְ� �޴°� ����, ����ȯ �ڡڡڡڡ�

		t.power();
		t.channel = 7;
		t.channelUp();
		t.channelUp();
		t.channelDown();
		System.out.println("TV ��ü ä�� : " + t.channel);

		c.power();
		c.channel = 11;
		c.channelDown();
		c.channelDown();
		c.caption();
		c.text = "�ܿ�ձ�2 ��ȭ�ڸ��� �߰� �Ǿ����ϴ�.";
		c.caption();
		System.out.println("CaptionTv ��ü ä�� " + c.channel);

	}

}
