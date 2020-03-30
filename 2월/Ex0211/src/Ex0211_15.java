public class Ex0211_15 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        int[] c = new int[10];
        int[] e = new int[10];
 
        int[] d = { 0, 500, 1000, 3000 };
        int[] f = { 0, 10, 100, 1000 };
 
        int tmp = 0;
        int ran = 0;
        int j = 0;
 
        int select = 0;
 
//        for (int i = 0; i < c.length; i++) {
//            select = (int) (Math.random() * 3);
//            switch(select){
//        case 0:
//            c[i]=1;
//        break;
//        case 1:
//        c[i]=10*1;
//            break;
//        case 2:
//            c[i]=10*10;
//           break;
//          case 3:
//        c[i]=10*10*10;
//              break;    
//            
//        }
 
        for (
 
                int i = 0; i < c.length; i++) {
            select = (int) (Math.random() * 4);
            c[i] = d[select];
        }
 
        System.out.println("1차원 배열 값 : ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
 
        }
 
    }
 
}
