import java.util.Scanner;

public class InPutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻʽÿ�: ");
		name = input.nextLine();
		
		System.out.print("���̸� �Է��Ͻʽÿ�: ");
		age = input.nextInt();
		
		System.out.println(name+"�� �ȳ��ϼ���!"+age+"���̽ó׿�.");
		
		input.close();

	}

}
