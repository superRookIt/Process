
public class Ref extends Product {

	static int count1;
	int pro_n = 2000;

	{
		pro_n = ++count1;

	} // �ν��Ͻ� �ʱ�ȭ?

	Ref() {

		price = 1500;
		name = "�����";

	}// default ������

}
