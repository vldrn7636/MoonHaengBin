package Chapter2;

import java.util.*; // 스캐너를 사용하기 위해 추가

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.printf("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine(); // 입력받은 내용을 문자열로 input에 저장
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

		System.out.println("입력내용 :" + input);
		System.out.printf("num=%d%n", num);

	}

}
