public class Television {
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("채널은 " + channel + 
				"이고 볼륨은 " + volume + "입니다.");
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
		System.out.println("텔레비전의 채널은" + tv.channel + "이고 볼륨은" +
		   tv.volume + "입니다.");
	}
}
