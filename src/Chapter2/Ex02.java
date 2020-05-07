package Chapter2;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		String s = "a";
		byte b1 = 100;
		int i1 = b1;
		byte b2 = (byte) i1;
		System.out.println("b1=" + b1 + ", i1=" + i1);

		byte b3 = (byte) 255;
		// 255=11111111 -> 1111 -> 111-111+1
		System.out.println("b3=" + b3);

		long l1 = 10;
		float f1 = l1;
		long l2 = (long) f1;
		char c1 = 'A';
		short s1 = (short) c1;
		char c2 = (char) b1;

		int i2 = (int) (i1 + l1);
		// 큰자료형+작은자료형=큰자료형

		System.out.println("번호:" + 1 + 2 + 3);
		// string+기본자료형=string
		System.out.println(1 + 2 + 3 + "번");

		char c3 = 'A';
		int i3 = c3;
		// A=65 (아스키코드값)
		System.out.println("c3=" + c3 + ",i3=" + (char) i3);
		System.out.println("c3=" + c3 + ",i3=" + i3);

		int b4;
		byte b5 = 1;
		byte b6 = 2;
		b4 = b5 + b6;
		// int 보다 작은 자료형의 연살 결과는 int
	}

}
