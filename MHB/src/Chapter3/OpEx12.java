package Chapter3;

public class OpEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'a'; 					// 'a': 코드값97
		char c2 = c1;
		char c3 = ' ';

		int i = c1 + 1;					// 97+1=98, 98='b'

		c3 = (char) (c1 + 1);			// 문자형과 정수형을 더하니 정수형으로 변환됨 ->int이하 연산은 int로, c3은 문자형이라 문자형으로 캐스팅(형변환)
		c2++;
		c2++;							// 99='c'

		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);

	}

}
