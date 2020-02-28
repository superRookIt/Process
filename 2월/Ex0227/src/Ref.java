
public class Ref extends Product {

	static int count1;
	int pro_n = 2000;

	{
		pro_n = ++count1;

	} // 인스턴스 초기화?

	Ref() {

		price = 1500;
		name = "냉장고";

	}// default 생성자

}
