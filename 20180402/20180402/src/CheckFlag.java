
public class CheckFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte flag = 0b00001010;
        if((flag&0b00001000)==0)
        	System.out.println("�µ��� 0�� ����");
        else
        	System.out.println("�µ��� 0�� �̻�");
	}

}
