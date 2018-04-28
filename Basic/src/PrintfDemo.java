
public class PrintfDemo {
	public static void main(String[] args) {
	
		System.out.printf("/%5d/%n",123);				//		/ +123/
		System.out.printf("/%+5d/%n",123);				//		/ +123/
		System.out.printf("/%X/%n",123);				//		/7B/
		System.out.printf("/%#X/%n",123);				//		/0X7B/
		System.out.printf("/%f/%n",12345.678);			//		/12345.678000/
		System.out.printf("/%10.2f/%n",12345.678);		//		/  12345.68/
		System.out.printf("/%-10.1f/%n",12345.678);		//		/12345.7   /
		System.out.printf("/%010.2f/%n",12345.678);		//		/0012345.68/
		System.out.printf("/%10.2E/%n",12345.678);		//		/  1.23E+04/
		System.out.printf("%,10.2f/%n",12345.678);		//		 12,345.68/
		System.out.printf("/%(10.1f/%n",-12345.678);	//		/ (12345.7)/
		System.out.printf("/%10.1f/%n",-12345.678);		//		/  -12345.7/
		
	}
}
