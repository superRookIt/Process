
public class Ex0303_05 {
	public static void main(String[] args) {

		Exception e_one = new Exception();

		try {

			StartInstall();
			CopyFile();
			System.out.println(5 / 0);
//			DeleteTempFile();

		} catch (Exception e) {

			e.printStackTrace();
//			DeleteTempFile();
			System.out.println("catch 구문이 실행 되었습니다");

		}

		finally {
			// DeleteTempFile()가 try, catch 둘다 공통적으로 들어가니까
			// finally로 한번에 넣어주기

			DeleteTempFile();
			System.out.println("finally 구문이 실행 되었습니다");

		}

	}// main

	static void StartInstall() {
		System.out.println("프로그램을 설치합니다. >> install 진행");
	}

	static void CopyFile() {
		System.out.println("신규프로그램을 복사합니다. >> copy 진행");
	}

	static void DeleteTempFile() {
		System.out.println("복사했던 임시파일을 삭제합니다. >> delete 진행");
	}

}// class
