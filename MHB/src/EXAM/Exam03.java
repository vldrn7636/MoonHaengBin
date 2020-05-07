package EXAM;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("필요한 동전 갯수를 출력하기");
		num = scan.nextInt();

		System.out.println("500원:" + (num / 500) + "개"); // 5500
		System.out.println("100원:" + ((num % 500) / 100) + "개"); // 114
		System.out.println("50원:" + (((num % 500) % 100) / 50) + "개");
		System.out.println("10원:" + ((((num % 500) % 100) % 50) / 10) + "개");
		System.out.println("1원:" + (((((num % 500) % 100) % 50) % 10) / 1) + "개");
		
		/*
		System.out.println("500원:" + num / 500 + "개"); 
		System.out.println("100원:" + num % 500 /100 + "개"); 
		System.out.println("50원:"  + num % 100 / 50 + "개");
		System.out.println("10원:"  + num % 50 / 10 + "개");
		System.out.println("1원:"   + num % 10 + "개");
		 */

	}

}
