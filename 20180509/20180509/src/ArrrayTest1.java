public class ArrrayTest1 {
	public static void main(String[] args) {
		int[] s = new int[10]; //크기가 10인 배열 생성
		for(int i=0; i<s.length; i++) {
			s[i]=i; //i번째 원소에 i를 저장.
		}
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]+" ");
		} //반복을 이용하여서 배열의 요소 출력. 배열의 크기는 s.length로 알 수 있음.
	}
}
