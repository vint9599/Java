
public class ArrayForEachDemo {

	public static void main(String[] args) {
		int sum = 0;
		int[] oneDim = { 2, 6, 1, 4, 3, 5 };

		for (int n : oneDim)
			sum += n;
		System.out.println(sum);

		sum = 0;
		int[][] twoDim = { { 2, 6, 1 }, { 4, 3, 5 } };

		for (int[] m : twoDim)
			for (int n : m)
				sum += n; // 二維陣列元素相加
		System.out.println(sum);

		int[][][] threeDim = { { { 2, 6, 1 }, { 4, 3, 5 } }, 
							 { { 2, 6, 1 }, { 4, 3, 5 } },
							 { { 2, 6, 1 }, { 4, 3, 5 } } }; // 3*2*3 陣列

		for (int[][] s : threeDim) // 共有幾個元素
			for (int[] m : s) // 第i列共有幾個元素
				for (int n : m) // 第i層第一列共有幾個元素
					sum += n;// 三維陣列元素相加
		System.out.println(sum); // 列印出 此陣列各個元素相加為多少
									// 有 '幾維' 陣列就要用 '幾個' 迴圈去做處理

	}

}
