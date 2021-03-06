import java.util.Scanner;
public class DaysInMonth {
	public static void main(String[] args) {
		int month;
		int days = 0;
		System.out.print("알고 싶은 월 입력: ");
		System.out.print("연도를 입력하세요: ");
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
			break; //break를 미 입력시 2월 달이 31일 까지로 출력된다.
		default:
			days = 31;
			break; //2,4,6,9,11을 제외한 나머지 달은 31일 까지로 출력된다.
		}
		System.out.println("월의 날수는 "+days);
		scan.close();
	}
}
