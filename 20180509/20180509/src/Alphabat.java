import java.util.Scanner;
public class Alphabat {
	public static void main(String[] args) {
		String words = "ABCDEFGHYJKLMNOPQRSTUVWXYZ";
		int n = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("0~25������ ���ڸ� �Է��ϼ���: ");
		n = input.nextInt();
		char y = words.charAt(n);
		System.out.println(y);
		input.close();
	}
}
