import java.util.Scanner;
public class LoopExample2 {
	public static void main(String[] args) {
		int n;
		int i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요: ");
		n = scan.nextInt();
		while(i<=19); {
			System.out.println(n+"*"+i+"="+n*i+" "); 
			i++;
		}
		scan.close();
	}
}
