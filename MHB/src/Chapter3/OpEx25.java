package Chapter3;

import java.util.Scanner;

public class OpEx25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		char ch=' ';									// null������ �ʱ�ȭ
		
		System.out.println("���ڸ� �ϳ� �Է��ϼ���.:");
		
		String input =scanner.nextLine();
		ch=input.charAt(0);								// �Է¹��� ���� ch�� ����
		
		if('0'<=ch && ch<'9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.\n");
		}
		if(('a'<=ch&&ch<='z') || ('A'<=ch&&ch<='Z')){
			System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�\n");
		}
	}

}
