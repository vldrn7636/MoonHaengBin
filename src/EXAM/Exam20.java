package EXAM;

import java.util.Scanner;

public class Exam20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자 입력");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int botoom = len * 2 - 1;				// 총 출력 갯수 식
		int mid = botoom / 2;					// 중앙값 식, 중앙값은  모두 동일

		for (int i = 0; i < len; i++) {			// 총 반복 횟수 
			for (int j = 0; j < botoom; j++) {	// 총 출력 갯수, 공백을 출력하던 별을 출력하던 총 출력 갯수는 모두  동일

				if (j>=mid-i && j<= mid+i)		// j가 중앙값 왼쪽값 보단 크고 오른쪽 값 보단 작다
					System.out.print("*");		// true면 "*"
				else
					System.out.print(" ");		// false면" "
			}
			System.out.println();				// 다음 줄로
		}
	}

}
