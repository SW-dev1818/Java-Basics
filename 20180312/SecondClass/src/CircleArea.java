
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;//원주율을 상수로 선언
		double radius = 10.2; //원의 반지름
		//원의 면적 계산
		double circleArea = radius*radius*PI;
		
		System.out.print("반지름"+radius+",");
		System.out.println("원의 면적 = "+ circleArea);
	}

}
