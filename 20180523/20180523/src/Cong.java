import java.util.Random;
public class Cong {
	public static void main(String[] args) {
		String[] events = {"�̿���", "������", "������", "��ȿ��", "�̽¹�",
				"��λ�", "�ּ���", "�̼ҹ�", "������", "������", "��ȿ��"};
		Random sort = new Random();
		int number = sort.nextInt(11);
		System.out.println("�����մϴ�. ��÷��: "+events[number]);
		for(int i=0; i<events.length; i++) {
			System.out.println("events"+"["+i+"]"+"="+events[i]);
		}
	}
}
