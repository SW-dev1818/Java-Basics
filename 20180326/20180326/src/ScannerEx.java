import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�.");
        //System.in ����ڰ� �Է��� ���̶�� �ǹ̸� ������
        Scanner scanner = new Scanner (System.in);
        String name = scanner.next(); //���ڿ� ��ū �б�
        System.out.println("����� �̸��� "+name+"�Դϴ�.");
        String city = scanner.next(); //���ڿ� ��ū �б�
        System.out.println("����� ��� ���ô�"+city+"�Դϴ�.");
        int age = scanner.nextInt(); //���� ��ū �б�
        System.out.println("����� ���̴�"+age+"�Դϴ�.");
        double weight = scanner.nextDouble(); //�Ǽ� ��ū �б�
        System.out.println("����� ü����"+weight+"kg�Դϴ�.");
        boolean single = scanner.nextBoolean(); //���� ��ū �б�
        System.out.println("����� ���� ���δ�"+single+"�Դϴ�.");
        	}

}