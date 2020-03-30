
public class Ex0211_08 {

	public static void main(String[] args) {
		
		//[7][9]
		
		
		 int[][] se = new int[7][9];
        
        for(int i =0; i<se.length; i++) {
            for(int j =0; j<se[i].length; j++) {
                se[i][j]=(i*9)+j+1;
            }
        }
        
        
        System.out.println("[2차원 배열]");
        for(int i =0; i<se.length; i++) {
            for(int j =0; j<se[i].length; j++) {
                System.out.print(se[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
        int[][] se1 = new int[7][9];
        
 
[2차원 배열]
1 2 3 4 5 6 7 8 9 
10 11 12 13 14 15 16 17 18 
19 20 21 22 23 24 25 26 27 
28 29 30 31 32 33 34 35 36 
37 38 39 40 41 42 43 44 45 
46 47 48 49 50 51 52 53 54 
55 56 57 58 59 60 61 62 63 
