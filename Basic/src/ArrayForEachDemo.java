
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
				sum += n; // �G���}�C�����ۥ[
		System.out.println(sum);

		int[][][] threeDim = { { { 2, 6, 1 }, { 4, 3, 5 } }, 
							 { { 2, 6, 1 }, { 4, 3, 5 } },
							 { { 2, 6, 1 }, { 4, 3, 5 } } }; // 3*2*3 �}�C

		for (int[][] s : threeDim) // �@���X�Ӥ���
			for (int[] m : s) // ��i�C�@���X�Ӥ���
				for (int n : m) // ��i�h�Ĥ@�C�@���X�Ӥ���
					sum += n;// �T���}�C�����ۥ[
		System.out.println(sum); // �C�L�X ���}�C�U�Ӥ����ۥ[���h��
									// �� '�X��' �}�C�N�n�� '�X��' �j��h���B�z

	}

}
