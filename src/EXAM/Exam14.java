package EXAM;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (str.charAt(i) - 48);
			// sum+=(str.charAt(i)-'0'); // '0'=48 , '1'=49
		}
		System.out.println(sum);
		/*
		 * str.length(); 
		 * str.charAt(0); 
		 * str.charAt(1); 
		 * str.charAt(2);
		 * System.out.println(str);
		 */

	}

}
