import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		int students;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요: ");
		students = scan.nextInt();
		int[] scores = new int[students];
		for(int i=0; i<students; i++) {			
			System.out.print("학생 수를 입력하세요: ");
			scores[i] = scan.nextInt();
			}
		for(int i=0; i<scores.length; i++) {			
			System.out.print("성적을 입력하시오: ");
			scores[i] = scan.nextInt();
			}
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("평균 성적은 "+total/students+"입니다.");
		scan.close();
	}
	}

