
public class ArrarySumDemo {

	public static void main(String[] args) {

		int sum = 0;
		int[] oneDim = { 2, 6, 1, 4, 3, 5 };

		for (int i = 0; i < oneDim.length; i++) {
			sum += oneDim[i]; // 一維陣列元素相加
		}
		sum = 0;
		int[][] twoDim = { { 2, 6, 1 }, { 4, 3, 5 } };

		for (int i = 0; i < twoDim.length; i++)
			for (int j = 0; j < twoDim[i].length; j++)
				sum += twoDim[i][j]; // 二維陣列元素相加
		System.out.println(sum);

		int[][][] threeDim = { { { 2, 6, 1 }, { 4, 3, 5 } },
							 { { 2, 6, 1 }, { 4, 3, 5 } },
							 { { 2, 6, 1 }, { 4, 3, 5 } } 
							 }; // 3*2*3 陣列

		for (int i = 0; i < threeDim.length; i++) // 共有幾個元素
			for (int j = 0; j < threeDim[i].length; j++) // 第i列共有幾個元素
				for (int k = 0; k < threeDim[i][j].length; k++) // 第i層第一列共有幾個元素
					sum += threeDim[i][j][k]; // 三維陣列元素相加
		System.out.println(sum); 	// 列印出 此陣列各個元素相加為多少
									// 有 '幾維' 陣列就要用 '幾個' 迴圈去做處理

	} // end of main
} // end of class
