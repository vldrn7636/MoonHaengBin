package EXAM;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int num = 0; // 5641

		System.out.println("숫자을 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		System.out.println((num > 0) ? "양수" : (num < 0) ? "음수" : "0");
							//조건식			   // true			 // false

	}

}
