import java.util.*;

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x;  //첫 번째 숫자 저장할 변수
        int y;  //두 번째 숫자를 저장할 변수
        int sum;  //합을 저장
        Scanner input = new Scanner(System.in);
        
        System.out.print("첫 번째 숫자를 입력하시오: ");
        x = input.nextInt();
        System.out.print("두 번째 숫자를 입력하시오: ");
        y = input.nextInt();
        sum = x+y;
        System.out.println(sum);
        input.close();
	}

}
