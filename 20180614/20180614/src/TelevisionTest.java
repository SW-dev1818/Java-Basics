public class TelevisionTest {
	public static void main(String[] args) {
		int wantch;
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print();
		/*System.out.println("�ڷ������� ä���� "+myTv.channel+"�̰� �ҷ��� "
				+myTv.volume+"�Դϴ�.");*/
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();
		/*System.out.println("�ڷ������� ä���� "+yourTv.channel+"�̰� �ҷ��� "
				+yourTv.volume+"�Դϴ�.");*/
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("���ϴ� ä���� �����ϼ���: ");
		wantch = scan.nextInt();*/
	}
}