
public class LogicalOperator {

	private static int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 3;
        int y = 4;
        System.out.println((x==3)&&(y==7)); //false
        System.out.println((x==3&& y==7));
        System.out.println((x==3)||(y==4)); //true
        System.out.println((x==3 || y==4));
        System.out.println((age>=20)&&(age<30)); //true
        System.out.println('a'>'b'); //false
        System.out.println(3>=2); //true
        System.out.println(-1<0); //true
        System.out.println(3.45<=2); //false
        System.out.println(3==2); //false
        System.out.println(3!=2); //true
        System.out.println(!(3!=2)); //false
        System.out.println((3>2)&&(3>4)); //false
        System.out.println((3!=2)||(-1>0)); //true
        System.out.println((3!=2)^(-1>0)); //true
        
	}

}
