public class ContinueTest {
	public static void main(String[] args) {
		String s = "Happy Birthday";
		int n = 0, y = 0;
		for(int i=0; i<s.length(); i++) {
			//n?? ?????? Ƚ???? ????.
			if(s.charAt(i) !='p') //n?? ?ƴҋ?
				continue;
			//n?? ?????? ?ϳ? ?????Ѵ?.
			n++;
		}
		System.out.println("???忡?? ?߰ߵ? p?? ???? "+ n);
		y = s.length();
		System.out.println(y);
	}
}
