import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		int score;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		score = input.nextInt();
		if(score>=90) {
			System.out.println("���� A");
		}else if(score>=85)	{
			System.out.println("���� B+");
		}else if(score>=95) {
			System.out.println("���� A+");
		}else if(score>=80){
			System.out.println("���� B");
		}else if(score>=70) {
			System.out.println("���� C");
		}else if(score>=60) {
			System.out.println("���� D");
		}else if(score>=50){
			System.out.println("���� F");
		}else if(score>=95) {
		    System.out.println("���� A+");
		}
		}
	}