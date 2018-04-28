
public class ArraySumDemo {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6 };

		int[] data1 = data;

		for (int i = 0; i < data.length - 3; i++)
			data[i] *= 10;

		for (int i = 0; i < data1.length; i++)
			System.out.println(data1[i]);

	}

}
