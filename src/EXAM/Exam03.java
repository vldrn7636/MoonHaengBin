package EXAM;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("�ʿ��� ���� ������ ����ϱ�");
		num = scan.nextInt();

		System.out.println("500��:" + (num / 500) + "��"); // 5500
		System.out.println("100��:" + ((num % 500) / 100) + "��"); // 114
		System.out.println("50��:" + (((num % 500) % 100) / 50) + "��");
		System.out.println("10��:" + ((((num % 500) % 100) % 50) / 10) + "��");
		System.out.println("1��:" + (((((num % 500) % 100) % 50) % 10) / 1) + "��");
		
		/*
		System.out.println("500��:" + num / 500 + "��"); 
		System.out.println("100��:" + num % 500 /100 + "��"); 
		System.out.println("50��:"  + num % 100 / 50 + "��");
		System.out.println("10��:"  + num % 50 / 10 + "��");
		System.out.println("1��:"   + num % 10 + "��");
		 */

	}

}
