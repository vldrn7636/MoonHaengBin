package Chapter2;

import java.util.*; // ��ĳ�ʸ� ����ϱ� ���� �߰�

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.printf("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine(); // �Է¹��� ������ ���ڿ��� input�� ����
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

		System.out.println("�Է³��� :" + input);
		System.out.printf("num=%d%n", num);

	}

}
