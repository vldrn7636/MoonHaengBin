package EXAM;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("계산할 초를 입력하세요");
		num = scan.nextInt();
		int h=0;
		int m=0;
		int s=0;
		
		h=(num/3600);
		m=((num%3600)/60);
		s=((num%3600)%60);
		System.out.println(h+"시 입니다");
		System.out.println(m+"분 입니다");
		System.out.println(s+"초 입니다");
		}
	}
