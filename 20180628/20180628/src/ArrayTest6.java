import java.util.Arrays;

public class ArrayTest6 {
	public static void main(String[] args) {
		int[] list = {10, 20, 30, 40, 50};
		int[] list_copy = Arrays.copyOf(list, 2*list.length);
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(list_copy));
	}
}
