
public class AssIncDecOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 3, d = 3;
        
        a = d++; //a=3, d=4
        System.out.println("a="+a+", d="+d);
        a = ++d; //a=5, d=5
        System.out.println("a="+a+", d="+d);
        a = --d; //a=3, d=3
        System.out.println("a="+a+", d="+d);
	}

}
