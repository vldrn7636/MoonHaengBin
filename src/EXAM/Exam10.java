package EXAM;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);

		if ('0' <= ch && ch <= '9') {			// �ѱ��ڻӸ� �ƴ϶� 5659559 ���� �ŵ� ��������.
			System.out.println("�����Դϴ�");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("�빮���Դϴ�");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("�ҹ����Դϴ�");		// �ҹ��ڿ� �빮�ڸ� ���� ���� �� �տ��ɷ� 
		} else {
			System.out.println("��Ÿ");
		}

	}

}
