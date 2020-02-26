
public class Ex0218_01 {

	public static void main(String[] args) {

		Time t1 = new Time();

		t1.minute = 10;
		t1.second = 10;
		t1.setHour(10);//¡Ú¡Ú¡Ú
		
		System.out.println(t1.minute);
		System.out.println(t1.getHour());// ¡Ú¡Ú¡Ú
		
		

//		Time t1 = new Time();
//         //10:10:10
//		
//		
//		t1.hour=10;
//		t1.minute=10;
//		t1.second=10;
//		
//		System.out.println(t1.hour+" : "+t1.minute+" : "+t1.second );
//		

	}// main

}// class
