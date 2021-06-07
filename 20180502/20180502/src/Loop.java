public class Loop {
	public static void main(String[] args) {
		int num = 2;
		while(num<20) {
			if(num%2!=0) {
				num++;
				break;
			}
			System.out.println("break를 쓰면 어떻게 될까요? "+num);
			num++;
		}
	}
}
