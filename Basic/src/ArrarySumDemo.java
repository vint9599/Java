
public class ArrarySumDemo {

	public static void main(String[] args) {

		int sum = 0;
		int[] oneDim = { 2, 6, 1, 4, 3, 5 };

		for (int i = 0; i < oneDim.length; i++) {
			sum += oneDim[i]; // �@���}�C�����ۥ[
		}
		sum = 0;
		int[][] twoDim = { { 2, 6, 1 }, { 4, 3, 5 } };

		for (int i = 0; i < twoDim.length; i++)
			for (int j = 0; j < twoDim[i].length; j++)
				sum += twoDim[i][j]; // �G���}�C�����ۥ[
		System.out.println(sum);

		int[][][] threeDim = { { { 2, 6, 1 }, { 4, 3, 5 } },
							 { { 2, 6, 1 }, { 4, 3, 5 } },
							 { { 2, 6, 1 }, { 4, 3, 5 } } 
							 }; // 3*2*3 �}�C

		for (int i = 0; i < threeDim.length; i++) // �@���X�Ӥ���
			for (int j = 0; j < threeDim[i].length; j++) // ��i�C�@���X�Ӥ���
				for (int k = 0; k < threeDim[i][j].length; k++) // ��i�h�Ĥ@�C�@���X�Ӥ���
					sum += threeDim[i][j][k]; // �T���}�C�����ۥ[
		System.out.println(sum); 	// �C�L�X ���}�C�U�Ӥ����ۥ[���h��
									// �� '�X��' �}�C�N�n�� '�X��' �j��h���B�z

	} // end of main
} // end of class
