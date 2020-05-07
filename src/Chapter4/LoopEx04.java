package Chapter4;

import java.util.Scanner;

public class LoopEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = (int) (Math.random() * 100) + 1; 		
		Scanner scan = new Scanner(System.in);
		int input;
		int cnt = 0;
		do {
			System.out.println("1~100 사이의 숫자를 입력하세요");
			input = scan.nextInt();
			if (ans > input) {
				System.out.println("더 큰 수 입니다");
			} else if (ans < input) {
				System.out.println("더 작은 수 입니다");
			} else {
				System.out.println("정답입니다!");
			}
			cnt++;
		} while (ans != input);
		System.out.println("횟수: " + cnt);

	}

}
