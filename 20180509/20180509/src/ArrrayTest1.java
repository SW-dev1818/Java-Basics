public class ArrrayTest1 {
	public static void main(String[] args) {
		int[] s = new int[10]; //ũ�Ⱑ 10�� �迭 ����
		for(int i=0; i<s.length; i++) {
			s[i]=i; //i��° ���ҿ� i�� ����.
		}
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]+" ");
		} //�ݺ��� �̿��Ͽ��� �迭�� ��� ���. �迭�� ũ��� s.length�� �� �� ����.
	}
}