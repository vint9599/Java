
public class ArrayAssignDemo {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6 };
		int[] data1 = new int[6];

		for (int i = 0; i < data.length; i++)
			data1[i] = data[i]; // �Ndata�}�C����ƽƻs�@����data1

		for (int i = 0; i < data.length - 3; i++)
			data[i] *= 10; // ��data����ư��ק�

		 for (int i = 0; i < data1.length; i++)
		 System.out.println(data[i]); // data����ƬO�w�g*10�����

		 for (int i = 0; i < data1.length; i++)
		 System.out.println(data1[i]);// data1�Odata�������ơA�èS������v�T

		int[] x = { 1, 2, 3, 4 };
		int[] y = x.clone();

		for (int i = 0; i < x.length; i++)
			System.out.printf("%d", x[i]);

		System.out.println();

		for (int i = 0; i < y.length; i++)
			System.out.printf("%d", y[i]);
	}

}
