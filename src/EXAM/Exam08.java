package EXAM;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		System.out.println("10부터 99까지의 두자리수를 입력하세요");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int result = (num % 10 == 0) ? num : (((num / 10) + 1) * 10);	// num과 같거나 큰 10의 배수 

		System.out.println(result + "-" + num + "=" + (result - num));

	}

}