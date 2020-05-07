package Chapter3;

import java.util.Scanner;

public class OpEx25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		char ch=' ';									// null값으로 초기화
		
		System.out.println("문자를 하나 입력하세요.:");
		
		String input =scanner.nextLine();
		ch=input.charAt(0);								// 입력받은 값을 ch에 삽입
		
		if('0'<=ch && ch<'9') {
			System.out.println("입력하신 문자는 숫자입니다.\n");
		}
		if(('a'<=ch&&ch<='z') || ('A'<=ch&&ch<='Z')){
			System.out.println("입력하신 문자는 영문자입니다\n");
		}
	}

}
