public class Displaystar {
	public static void main(String[] args) {
		char c = ' ';
		for(int i=0;i<10;i++) {
			int k = 10;
			int l = k;
			for(int j=0;j<k;j++) {
				--l;
				if(i==j||i==1) {
					c = '*';
				}else {
					c = ' ';
				}
				System.out.print(c);
			}
		}
	}
}
