import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ����: ");
		int count = scan.nextInt();
		int sum = 0;
		for(int i = 0; i < count; i++) {
			int number = generator.nextInt(100);
			sum+=number;
			System.out.println("���� -"+number);
		}
		System.out.println("����"+count+"���� ����"+sum);
		scan.close();
	}
}