import java.util.Scanner;


public class CalSum2{

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϰ� ���� ��: ");
		int n = sc.nextInt();
		while(i<=n) {
			sum = sum + i;
			i++;
		}
		System.out.print("�հ�="+sum);
	}

}