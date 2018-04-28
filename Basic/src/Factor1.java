
public class Factor1 {
	static int factorial(int num) {
		int result = 1;
		for (int i = num; i >= 1; i--)
			result *= i;
		return result;
	}

	public static void main(String[] num) {
		int number = Integer.parseInt(num[0]);
		System.out.println(number + "!= " + factorial(number));
	}
}//命令列引數法
