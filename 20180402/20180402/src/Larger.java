import java.util.Scanner;
public class Larger {
	public static void main(String[] args) {
		int x, y, max;
		Scanner input = new Scanner(System.in);
		System.out.println("ù ��° ����: ");
		x = input.nextInt();
		System.out.println("�� ��° ����: ");
		y = input.nextInt();
		if(x>y) {
			max = x;
		}else {
			max = y;
		}
        System.out.println("ū ����"+max);
        input.close();
	}

}