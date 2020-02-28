
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
		c2 = (Captiontv) t2; // -> 주소값 넘겨주고 받는거 가능, 형변환 ★★★★★

		t.power();
		t.channel = 7;
		t.channelUp();
		t.channelUp();
		t.channelDown();
		System.out.println("TV 객체 채널 : " + t.channel);

		c.power();
		c.channel = 11;
		c.channelDown();
		c.channelDown();
		c.caption();
		c.text = "겨울왕국2 영화자막이 추가 되었습니다.";
		c.caption();
		System.out.println("CaptionTv 객체 채널 " + c.channel);

	}

}
