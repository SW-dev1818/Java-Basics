import java.util.Scanner;
public class DaysInMonth {
	public static void main(String[] args) {
		int month;
		int days = 0;
		System.out.print("�˰� ���� �� �Է�: ");
		System.out.print("������ �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break; //break�� �� �Է½� 2�� ���� 31�� ������ ��µȴ�.
		default:
			days = 31;
			break; //2,4,6,9,11�� ������ ������ ���� 31�� ������ ��µȴ�.
		}
		System.out.println("���� ������ "+days);
		scan.close();
	}
}