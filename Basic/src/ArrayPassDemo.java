
public class ArrayPassDemo {

	public static void method(int[] data) {

		for (int i = 0; i < data.length; i++)

			data[i] *= 10;
	}

	public static void main(String[] args) {

		int[] data = { 2, 6, 1, 4, 3, 5 };

		method(data);
		for (int i = 0; i < data.length; i++)
			System.out.println(data[i]); // method�Pmain�ϥλP�P�@���O����A�|�ק��main����ơA�o�˴N�S���ɮת���l��

	}

}
