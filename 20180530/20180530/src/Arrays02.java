import java.util.Arrays;
public class Arrays02 {
	public static void main(String[] args) {
		String[] str = {"이예지", "안진수", "형성원", "이효제", "이승민", "백두산",
		"최성영", "이소민", "윤찬수", "이윤임", "김효정"};
		Arrays.sort(str);
		for(int i=0; i<str.length; i++) {
			System.out.println("[i="+i+"]-----["+str[i]+"]");
	}
}
}
