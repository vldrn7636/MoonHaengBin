package Chapter4;

public class LoopEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "��");
			for (int j = 2; j <= 9; j++) {
				if (j == 5) break;				// x5 ������ ���
				if (j == 5) continue;			// x5�� ���� ���
				System.out.println(i + "x" + j + "=" + (i * j));
			}

		}

	}
}