public class Loop1 {
	public static void main(String[] args) {
		int i = 0;
		while(true) {
			if(i>10) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}
}
