package EXAM;

public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum1 += i;
			}
		}
		System.out.println("2와3의 배수의 합: " + sum1);

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum2 += i;
			}
			/*
			 * if (i % 2 == 0 || i % 3 == 0) continue; { 컨티뉴는 해당 조건식 실행 안 함
			 *  	sum1 += i; } 
			 */

		}
		System.out.println("2와3의 배수가 아닌 수의 합: " + sum2);

	}
}