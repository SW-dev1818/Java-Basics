import java.util.Scanner;
public class StringSwitch2 {
	public static void main(String[] args) {
		String month;
        Scanner scan = new Scanner(System.in);
        System.out.println("���� �̸��� �Է��ϼ���: ");
        month = scan.next();
        int monthNumber;
        switch (month) {
        case "January":
        	monthNumber = 1;
        	break;
        case "February":
        	monthNumber = 2;
        	break;
        case "March":
        	monthNumber = 3;
        	break;
        case "April":
        	monthNumber = 4;
        	break;
        default:
        	monthNumber = 0;
        	break;
        }
        System.out.println(monthNumber+"��");
        scan.close();
	}

}
