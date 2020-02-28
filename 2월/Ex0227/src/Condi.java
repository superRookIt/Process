
public class Condi extends Product {

	static int count2;
	int pro_n = 3000;

	{
		pro_n = ++count2;

	} // 인스턴스 초기화?

	Condi() {

		price = 900;
		name = "에어컨";

	}// default 생성자

}
