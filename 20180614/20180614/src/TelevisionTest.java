public class TelevisionTest {
	public static void main(String[] args) {
		int wantch;
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print();
		/*System.out.println("텔레비전의 채널은 "+myTv.channel+"이고 불륨은 "
				+myTv.volume+"입니다.");*/
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();
		/*System.out.println("텔레비전의 채널은 "+yourTv.channel+"이고 불륨은 "
				+yourTv.volume+"입니다.");*/
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("원하는 채널을 선택하세요: ");
		wantch = scan.nextInt();*/
	}
}
