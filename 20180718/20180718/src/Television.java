public class Television {
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("ä���� " + channel + 
				"�̰� ������ " + volume + "�Դϴ�.");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
	
	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("�ڷ������� ä����" + tv.channel + "�̰� ������" +
		   tv.volume + "�Դϴ�.");
	}
}
