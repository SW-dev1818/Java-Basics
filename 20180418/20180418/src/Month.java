import java.util.Scanner;
public class Month {
	public static void main(String[] args) {
	//int month;
		int days = 0;
		int year;
		System.out.print("������ �Է��ϼ���: ");
		System.out.print("�˰� ���� ���� �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		year = scan.nextInt();
		
		switch (month) {
		
		case 2:
			if((year%4==0&&year%100!=0)||year%400==0) {
				System.out.println("29��");
			}else
				System.out.println("28��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
				
		 default:
			days = 31;
			break;
			
		}
		System.out.println("���� ������ "+days);
		scan.close();
	}
}
	
		
			
		
