package Chapter4;

import java.util.Scanner;

public class LoopEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = (int) (Math.random() * 100) + 1; 		
		Scanner scan = new Scanner(System.in);
		int input;
		int cnt = 0;
		do {
			System.out.println("1~100 ������ ���ڸ� �Է��ϼ���");
			input = scan.nextInt();
			if (ans > input) {
				System.out.println("�� ū �� �Դϴ�");
			} else if (ans < input) {
				System.out.println("�� ���� �� �Դϴ�");
			} else {
				System.out.println("�����Դϴ�!");
			}
			cnt++;
		} while (ans != input);
		System.out.println("Ƚ��: " + cnt);

	}

}
