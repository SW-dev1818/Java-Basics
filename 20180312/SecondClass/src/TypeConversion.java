
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 타입 byte(1바이트,-128~127),short
		//int, long
		byte b = 127;
		int i = 100;
		System.out.println(b+i);//227
		System.out.println(10/4); //2
		System.out.println(10.0/4); //4 -> 4.0으로 변환
		System.out.println((int)2.9+1.8); //3.8
		System.out.println((int)(2.9+1.8)); //4
		System.out.println((int)2.9+(int)1.8);//3
	}

}
