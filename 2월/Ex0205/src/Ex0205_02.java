import java.util.Scanner;

public class Ex0205_02 {
	public static void main(String[] args) {
		
		// [�μ��� ��Ģ���� ���α׷�]
		// 1)���ϱ�
		// 2)����
		// 3)���ϱ�
		// 4)������
		// ���ϴ� ���ڸ� �Է��ϼ��� (����.0)
		// 1�� �����ϰ� �Ǹ� �� ���� �Է��ϼ��� (������ �̵�:0)
		//    1,2 -> �� ���� ���� �� :3 (1~9������ ���� �� ����)
		
		Scanner scan = new Scanner(System.in);
		
         int dan = 0;
         int select1 = 0;
         int select2 = 0;
         int select3 = 0;
         int i = 0;
         int j = 0;
		
		while(true){ // �ý��� ��ü�� �ΰ� �ϴ� ��
		System.out.println("���ϴ� ���� �ΰ��� �Է��ϼ���");
		select1 = scan.nextInt();
		select2 = scan.nextInt();
		System.out.println("1) ���ϱ�");
		System.out.println("2) ����");
		System.out.println("3) ���ϱ�");
		System.out.println("4) ������");
		System.out.println("5) ���ϴ� �� ���");
		System.out.println("0) ����");
		dan = scan.nextInt();
		
		
		if(dan==0) {
			System.out.println("�ý����� �����մϴ�");
			break;
		     }
			
		
		if (dan>4 && dan<0) {
			System.out.println("�ٽ� �Է����ּ���");
			System.out.println();
		         }
	     if (dan ==1) {
	    	System.out.println("���ϱ⸦ �ϰڽ��ϴ�");
	    	System.out.println(select1+select2);
	    	break;
	     }
		     if (dan==2) {
		    	 System.out.println("���⸦ �ϰڽ��ϴ�");
		         System.out.println(select1-select2);
		         break;
		     }
		     
		     if (dan ==3) {
		    	 System.out.println("���ϱ⸦ �ϰڽ��ϴ�");
		    	 System.out.println(select1*select2);
		    	 break;
		     }
		     
		     if(dan==4) {
		      System.out.println("�����⸦ �ϰڽ��ϴ�");
	           System.out.println(select1/select2);
	           break;
		     }
		    	 
		     if(dan==5) {
		    	 System.out.println("���� ����մϴ�");
		    	 select3 = scan.nextInt();
		    	 for(i = select3; i==select3; i++) {
		    		 for(j=1; j<=9; j++)
		    		 System.out.println(select3+" * " +j+" = "+select3*j);}
		    	 break;
		    	 }
		    	 
		     
		} //while ��
		
		
	} // main

} // class
