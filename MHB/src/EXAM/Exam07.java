package EXAM;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();

		System.out.println(score + "������"
				+ ((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F"));

	}

}
