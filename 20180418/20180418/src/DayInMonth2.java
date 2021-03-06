import java.util.Scanner;
public class DayInMonth2 {
	public static void main(String[] args) {
		int month;
		int days = 0;
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요: ");
		year = scan.nextInt();
		System.out.println("알고 싶은 월: ");
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
			break; //break 미 입력시 2040년 2월이 29일로 출력되지 않음.
		default:
			days = 31;
			break;
		}
		System.out.println("월의 날수는 "+days);
		scan.close(); //문법상 닫아주어야 함.
	}

}
