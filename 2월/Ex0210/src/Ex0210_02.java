import java.util.Scanner;

public class Ex0210_02 {
public static void main(String[] args) {
	
	
	
	int count=10;
	int user =0;
	int com =0;
	
	Scanner scan = new Scanner(System.in);
	
	for(int i =0; i<count; i++) {
		System.out.println("1-���� 2-���� 3-�� �� �ϳ��� �����ϼ���");
		user = scan.nextInt();
		
		com = (int)(Math.random()*3+1);
		
	}
	
	switch(user-com) {
	
	}
	
	
}
}
