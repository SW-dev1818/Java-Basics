import java.util.Scanner;
public class DayInMonth2 {
	public static void main(String[] args) {
		int month;
		int days = 0;
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���: ");
		year = scan.nextInt();
		System.out.println("�˰� ���� ��: ");
		month = scan.nextInt();
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if((year%4==0&&year%100!=0)||year%400==0) {
				days = 29;
			}else {
				days = 28;
			}
			break; //break �� �Է½� 2040�� 2���� 29�Ϸ� ��µ��� ����.
		default:
			days = 31;
			break;
		}
		System.out.println("���� ������ "+days);
		scan.close(); //������ �ݾ��־�� ��.
	}

}