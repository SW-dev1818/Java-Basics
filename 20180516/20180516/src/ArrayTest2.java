import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		int students;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("�л� ���� �Է��ϼ���: ");
		students = scan.nextInt();
		int[] scores = new int[students];
		for(int i=0; i<students; i++) {			
			System.out.print("�л� ���� �Է��ϼ���: ");
			scores[i] = scan.nextInt();
			}
		for(int i=0; i<scores.length; i++) {			
			System.out.print("������ �Է��Ͻÿ�: ");
			scores[i] = scan.nextInt();
			}
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("��� ������ "+total/students+"�Դϴ�.");
		scan.close();
	}
	}

