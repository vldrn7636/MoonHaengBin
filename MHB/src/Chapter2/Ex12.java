package Chapter2;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		byte b = (byte) i;
		System.out.printf("[int - > byte] i=%d - > b=%d%n", i, b);

		i = 300;
		b = (byte) i; // byte의 표현범위 -> -128~127
		System.out.printf("[int - > byte] i=%d - > b=%d%n", i, b); // byte로는 300표현 불가

		b = 10;
		i = (int) b;
		System.out.printf("[int - > byte] b=%d - > i=%d%n", b, i);

		b = -2;
		i = (int) b;
		System.out.printf("[byte -> int] b=%d - > i=%d%n", b, i);

		System.out.println("i=" + Integer.toBinaryString(i));
	}

}
