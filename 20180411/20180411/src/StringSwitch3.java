import java.util.Scanner;
public class StringSwitch3 {
	public static void main(String[] args) {
		int number;
		String month = null;
		Scanner scan = new Scanner(System.in);
        System.out.println("월을 입력하시오: ");
        number = scan.nextInt();
        switch(number) {
        case 1:
        	month = "January";
        	break;
        case 2:
        	month = "February";
        	break;
        case 3:
        	month = "March";
        	break;
        case 4:
        	month = "April";
        	break;
        case 5:
        	month = "May";
        	break;
        case 6:
        	month = "June";
        	break;
        default:
        	month = "?";
        	break;
        }
        System.out.println(month);
        scan.close();
	}

}
