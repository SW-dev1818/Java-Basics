import java.util.Arrays;
public class Arrays02 {
	public static void main(String[] args) {
		String[] str = {"�̿���", "������", "������", "��ȿ��", "�̽¹�", "��λ�",
		"�ּ���", "�̼ҹ�", "������", "������", "��ȿ��"};
		Arrays.sort(str);
		for(int i=0; i<str.length; i++) {
			System.out.println("[i="+i+"]-----["+str[i]+"]");
	}
}
}
