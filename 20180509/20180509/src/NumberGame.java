import java.util.Random;
import java.util.Scanner;
public class NumberGame {
	public static void main(String[] args) {
		Random generator = new Random();
		System.out.print("정답을 추측하여 보시오: ");
		Scanner sc = new Scanner(System.in);
		int guess;
		int answer = sc.nextInt();
		int tries = 0;
		
		for(int i=0; i<answer; i++) {
			int number = generator.nextInt(100);
			tries = number;
		}
		do{
			System.out.print("정답을 추측하여 보시오: ");
			answer = sc.nextInt();
			guess = sc.nextInt();
			if(guess>answer) {
				System.out.println("제시한 점수가 높습니다.");
			}
			if(guess<answer) {
				System.out.println("제시한 점수가 낮습니다.");
			}
		
	}while(guess !=answer);
	System.out.println("축하합니다. 시도 횟수= "+tries);
	sc.close();
	}

}





