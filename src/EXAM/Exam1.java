package EXAM;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �ʸ� �Է��ϼ���");
		num = scan.nextInt();
		int h=0;
		int m=0;
		int s=0;
		
		h=(num/3600);
		m=((num%3600)/60);
		s=((num%3600)%60);
		System.out.println(h+"�� �Դϴ�");
		System.out.println(m+"�� �Դϴ�");
		System.out.println(s+"�� �Դϴ�");
		}
	}
