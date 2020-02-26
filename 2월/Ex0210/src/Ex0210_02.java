import java.util.Scanner;

public class Ex0210_02 {
public static void main(String[] args) {
	
	
	
	int count=10;
	int user =0;
	int com =0;
	
	Scanner scan = new Scanner(System.in);
	
	for(int i =0; i<count; i++) {
		System.out.println("1-가위 2-바위 3-보 중 하나를 선택하세요");
		user = scan.nextInt();
		
		com = (int)(Math.random()*3+1);
		
	}
	
	switch(user-com) {
	
	}
	
	
}
}
