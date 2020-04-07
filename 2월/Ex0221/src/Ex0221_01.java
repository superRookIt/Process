public class Ex0221_01 {

	public static void main(String[] args) {

//        Student s = new Student();
//        
//        Student t = add(s);
//    

    
    static Student add(Student s){
       return s
            }
//

	// 이름이 add로 같지만 타입이 다르니까 가능!!

	static void add() {
	}

	static void add(int a) {
	}
	// static void add(int x){} (X) -> 타입이 같아서 이름이 달라도 소용없음

	static void add(int a, int b) {
	}
	// static void add(int x, int y {} (X) -> 타입이 같아서 이름이 달라도 소용없음

	static void add(char a) {
	}

//

	int a = 0;
	char b = 'a';
	String c = "abc";
	long d = 1000000000;
	float e = 1.5f;
	double f = 3.141989788;

	print();

	print(a);
        print(b);
        print(c);
        print(d);
 
    }// main

	static void print() {
		System.out.println("null");
	}

	static void print(int a) {
		System.out.println("int");
	}

	static void print(char a) {
		System.out.println("char");
	}

	static void print(String a) {
		System.out.println("String");
	}

	static void print(long a) {
		System.out.println("long");
	}

}// class
