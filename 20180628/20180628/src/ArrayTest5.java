import java.util.Arrays;

public class ArrayTest5 {
	public static void main(String[] args) {
		int[] list = {10, 20, 30, 40, 50};
		int[] numbers = list;
		numbers[2] = 90;
		System.out.println(Arrays.toString(numbers));
	}
}
