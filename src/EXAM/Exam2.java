package EXAM;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� ������ �Է��ϼ���");
		num = scan.nextInt();
		
		System.out.println((num/100)*100);
		System.out.println(num-(num%100));
	}

}
