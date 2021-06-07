import java.util.Scanner;
public class Choice {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		number = input.nextInt();
		//number를 2로 나누어서 나머지가 0이냐?
		if(number%2==0) {
			System.out.println("입력된 숫자는 짝수입니다.");
		}else {
			System.out.println("입력된 숫자는 홀수입니다.");
		}
		input.close();
	}

}
