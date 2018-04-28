
public class Literal {
	
	public static void main(String[] args) {
		int x =100;
		System.out.println(x);
		x = 0144;
		System.out.println(x);
		x= 0X64;
		System.out.println(x);
		
		double d =3.14159;
		System.out.println(d);
		d = 5.2312;
		System.out.println(d);		
		
		
		char c = 'A';
		System.out.println(c);	
		c = '\u0042';
		System.out.println(c);
		
		 d = '家';
		System.out.println(d);
		
		final double PI = 3.14159;
		System.out.println(PI);
		 // 由於之前用final轉成常數型變數故compiler不讓你在變更數值
		
		
		
		
	}

} 