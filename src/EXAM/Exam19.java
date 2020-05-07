package EXAM;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자 입력");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();

		for (int i = len; i >= 1; i--) {
			for (int j = 1; j <= len; j++) {
				if (i > j)					
					System.out.print(" ");	// true일 경우 " "(공백) 출력
				else
					System.out.print("*");	// false일 경우 "*" 출력
			}
			System.out.println();
		}
	}

}
