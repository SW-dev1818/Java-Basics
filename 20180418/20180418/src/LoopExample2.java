import java.util.Scanner;
public class LoopExample2 {
	public static void main(String[] args) {
		int n;
		int i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��ϼ���: ");
		n = scan.nextInt();
		while(i<=19); {
			System.out.println(n+"*"+i+"="+n*i+" "); 
			i++;
		}
		scan.close();
	}
}
