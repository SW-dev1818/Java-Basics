import java.util.Scanner;


public class CalSum2{

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("더하고 싶은 값: ");
		int n = sc.nextInt();
		while(i<=n) {
			sum = sum + i;
			i++;
		}
		System.out.print("합계="+sum);
	}

}
