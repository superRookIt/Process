
public class Ex0211_05 {

	public static void main(String[] args) {
		
		int[] coin= {500,100,50,10}; //length 4
		int[] money = new int[4]; // length 4 (index´Â 0 1 2 3 )
		
		money[0] = coin[0];
		
		for (int i =0; i<money.length;i++) {
			System.out.println(money[i]);
		}
		
//		
//		money[0]=5000; // 5000 100 50 10
//		
//		for (int i =0; i<coin.length;i++) {
//			System.out.println(coin[i]); // 
//		}
		
	}

}
