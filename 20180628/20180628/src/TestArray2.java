public class TestArray2 {
	public static void main(String[] args) {
		int[][] testArray = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		for(int i=0; i<testArray.length; i++) {
			for(int j=0; j<testArray[i].length; j++) {
				System.out.print(testArray[i][j]+" ");
			}
		}
	}
}
