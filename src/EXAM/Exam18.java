package EXAM;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자 입력");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();

		for (int i = len; 0 <= i; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
