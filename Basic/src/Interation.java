
public class Interation {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		while (n <= 10) {
			sum += n;
			n++;
		}
		System.out.println(sum); // while 從10-1

		n = 0;
		sum = 0;
		do {
			sum += n;
			n++;
		} while (n <= 10);
		System.out.println(sum); // do while 從10-1

		sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum); // for 從10-1

		sum = 0;
		for (int i = 10; i >= 1; i--) {
			sum += i;
		}
		System.out.println(sum); // for 從1-10
		
		

		
		//偶數
		sum = 0;
		for (int i = 2; i<10; i+=2) { //i++, i++ // i = i+2
			sum += i;
		}
		System.out.println(sum); // for 從1-10	 
		
		
		sum = 0;
		int b = 0;
		for (int i = 2; i<10; i+=2, b++) { //i++, i++ // i = i+2
			sum += i;
		}
		System.out.println(sum + ", b ="+ b); // 特殊用法 	
	}

}
