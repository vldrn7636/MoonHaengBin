package EXAM;

import java.util.Scanner;

public class Exam20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �Է�");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int botoom = len * 2 - 1;				// �� ��� ���� ��
		int mid = botoom / 2;					// �߾Ӱ� ��, �߾Ӱ���  ��� ����

		for (int i = 0; i < len; i++) {			// �� �ݺ� Ƚ�� 
			for (int j = 0; j < botoom; j++) {	// �� ��� ����, ������ ����ϴ� ���� ����ϴ� �� ��� ������ ���  ����

				if (j>=mid-i && j<= mid+i)		// j�� �߾Ӱ� ���ʰ� ���� ũ�� ������ �� ���� �۴�
					System.out.print("*");		// true�� "*"
				else
					System.out.print(" ");		// false��" "
			}
			System.out.println();				// ���� �ٷ�
		}
	}

}
