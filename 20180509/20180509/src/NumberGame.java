import java.util.Random;
import java.util.Scanner;
public class NumberGame {
	public static void main(String[] args) {
		Random generator = new Random();
		System.out.print("������ �����Ͽ� ���ÿ�: ");
		Scanner sc = new Scanner(System.in);
		int guess;
		int answer = sc.nextInt();
		int tries = 0;
		
		for(int i=0; i<answer; i++) {
			int number = generator.nextInt(100);
			tries = number;
		}
		do{
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			answer = sc.nextInt();
			guess = sc.nextInt();
			if(guess>answer) {
				System.out.println("������ ������ �����ϴ�.");
			}
			if(guess<answer) {
				System.out.println("������ ������ �����ϴ�.");
			}
		
	}while(guess !=answer);
	System.out.println("�����մϴ�. �õ� Ƚ��= "+tries);
	sc.close();
	}

}




