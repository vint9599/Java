
public class Operators {

	public static void main(String[] args) {
		int sec = 8371;
		
		int csec = sec;		//�ˤ@���ܼ�(sec)���B��
		
		int tsec = sec%60 ; //��X���
		
		int hour = (sec - tsec) /3600; //��X�p�� 
		csec = csec - hour*3600; 
		
		int minu = csec /60; // ��X����
		
		System.out.println(sec + "��=" + hour + "�p��" + minu + "��" + tsec + "��");
		System.out.printf("%d��=%d�p��%d��%d��%n", sec, hour, minu, tsec); //��printf²�ƫ����
		
		
		int x = 3, y = 4, z;
	//	z = ++x * y; 		//x =4,y = 4,z = 16 
	//	z = x++*y; 			//x =4,y = 4,z = 12
	//	z = (x++)*y;		//x =4,y = 4,z = 12 	�p�A��()�N��++�ݩ�x���A���N��B�����
	//	z = x+++y;			//x =4,y = 4,z = 7
	//	z = x+++y++;		//x =4,y = 5,z = 7
	 	z = ++x+y++; 		//x =4,y = 5,z = 8
		System.out.println("x =" + x  + ",y = " + y + ",z = " + z );
		

	}

}
