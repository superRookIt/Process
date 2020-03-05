
public class Ex0304_07 {

	public static void main(String[] args) {

		String user_id = "8801&11111111";

		if (user_id.matches("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힝]*")) { // 정규식 ★
			System.out.println("특수문자 없음");
		} else {
			System.out.println("특수문자 있음");
		}

	}// main

}// class
