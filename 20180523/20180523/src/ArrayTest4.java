
public class ArrayTest4 {

	public static void main(String[] args) {
		int[] list = {10,20,30,40,50};
		int[] numbers = list;
		for(int i=0; i<list.length; i++)  {
			System.out.println(list[i]);
			System.out.println(numbers[i]);
			System.out.println("----");
		}

	}

}
