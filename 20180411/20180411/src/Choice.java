import java.util.Scanner;
public class Choice {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		number = input.nextInt();
		//number�� 2�� ����� �������� 0�̳�?
		if(number%2==0) {
			System.out.println("�Էµ� ���ڴ� ¦���Դϴ�.");
		}else {
			System.out.println("�Էµ� ���ڴ� Ȧ���Դϴ�.");
		}
		input.close();
	}

}
