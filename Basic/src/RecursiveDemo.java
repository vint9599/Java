
public class RecursiveDemo {

	static void method(int n) {

		System.out.println("level " + n);
		if (n < 4)
			method(n + 1);
		System.out.println("Level " + n);

	} // end of method()

	public static void main(String args[]) {
		method(1);

	} // end of main()

} // end of class RecursiveDemo
