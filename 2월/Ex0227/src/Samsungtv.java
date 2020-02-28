
public class Samsungtv extends Product {

	static int count;
	int pro_n = 1000;

	{
		pro_n = ++count;

	} // 인스턴스 초기화?

	Samsungtv() {

		price = 1000;
		name = "TV";

	}// default 생성자

}
