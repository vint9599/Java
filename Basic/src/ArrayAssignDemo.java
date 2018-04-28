
public class ArrayAssignDemo {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6 };
		int[] data1 = new int[6];

		for (int i = 0; i < data.length; i++)
			data1[i] = data[i]; // 將data陣列的資料複製一份到data1

		for (int i = 0; i < data.length - 3; i++)
			data[i] *= 10; // 對data的資料做修改

		 for (int i = 0; i < data1.length; i++)
		 System.out.println(data[i]); // data的資料是已經*10的資料

		 for (int i = 0; i < data1.length; i++)
		 System.out.println(data1[i]);// data1是data原先的資料，並沒有受到影響

		int[] x = { 1, 2, 3, 4 };
		int[] y = x.clone();

		for (int i = 0; i < x.length; i++)
			System.out.printf("%d", x[i]);

		System.out.println();

		for (int i = 0; i < y.length; i++)
			System.out.printf("%d", y[i]);
	}

}
