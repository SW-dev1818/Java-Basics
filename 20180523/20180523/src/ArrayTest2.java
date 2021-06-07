import java.util.Arrays;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] ball = new int[30];
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
		}
		int te = 0;
		int j = 0;
		for(int i=0; i<100; i++) {
			j= (int)((Math.random()*29)+1);
			te = ball[0];
			ball[0] = ball[j];
			ball[j] = te;
		}
		for(int i=0; i<ball.length; i++) {
			System.out.print(ball[i]+" ,");
		}
		System.out.println();
		System.out.println(Arrays.toString(ball));
	}
}
