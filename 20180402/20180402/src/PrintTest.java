
public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value = 1.0/3.0;
		System.out.println(value);
		//실수를 6개의 칸에 표시하고 소수점 2자리까지
		System.out.printf("%10.2f", value);
		System.out.printf("%d", 10); //정수
		System.out.printf("%f", 3.14); //실수
		System.out.printf("%c",'a'); //문자
		System.out.printf("%s", "Hello"); //문자열
	}
}
