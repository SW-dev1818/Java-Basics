
public class CalTime {

	public static void main(String[] args) {
		  // final을 붙여서 빛의 속도를 부동소수점형 기호상수로 정의하고 있음
		final double light_Speed = 30e4;
		double distance = 40e12;
		
		double secs;
		secs = distance/light_Speed;
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은"+light_year + 
				"광년입니다.");
    }

}
