package EXAM;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "��\t");								// ������� ���
		}
		for (int i = 2; i <= 9; i++) {
			System.out.print("\n");
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");	// println ��� print�� ����Ͽ� ���η� �����
			}

		}

	}
}
