import java.util.*;

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x;  //ù ��° ���� ������ ����
        int y;  //�� ��° ���ڸ� ������ ����
        int sum;  //���� ����
        Scanner input = new Scanner(System.in);
        
        System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�: ");
        x = input.nextInt();
        System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�: ");
        y = input.nextInt();
        sum = x+y;
        System.out.println(sum);
        input.close();
	}

}