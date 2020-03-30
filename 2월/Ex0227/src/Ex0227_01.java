
public class Ex0227_01 {

	public static void main(String[] args) {

		Stu_01 s1 = Stu_01.Getinstance();
		Stu_01 s2 = Stu_01.Getinstance();
		
		// Time t=new Time();
		// Time t2=new Time();
		// t2=t;
		
		 s1.setName("홍길동");
                 s2.setName("이순신"); 
		
		System.out.println(s1);
		System.out.println(s2);

	}//main

}//class
