
public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value = 1.0/3.0;
		System.out.println(value);
		//�Ǽ��� 6���� ĭ�� ǥ���ϰ� �Ҽ��� 2�ڸ�����
		System.out.printf("%10.2f", value);
		System.out.printf("%d", 10); //����
		System.out.printf("%f", 3.14); //�Ǽ�
		System.out.printf("%c",'a'); //����
		System.out.printf("%s", "Hello"); //���ڿ�
	}
}