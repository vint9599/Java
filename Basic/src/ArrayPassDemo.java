
public class ArrayPassDemo {

	public static void method(int[] data) {

		for (int i = 0; i < data.length; i++)

			data[i] *= 10;
	}

	public static void main(String[] args) {

		int[] data = { 2, 6, 1, 4, 3, 5 };

		method(data);
		for (int i = 0; i < data.length; i++)
			System.out.println(data[i]); // method與main使用與同一塊記憶體，會修改到main的資料，這樣就沒有檔案的原始檔

	}

}
