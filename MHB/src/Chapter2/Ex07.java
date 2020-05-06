package Chapter2;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 1;
		short s = 2;
		char c = 'A';

		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;

		int octNum = 010; // 8진수 10, 10진수 8 -> 앞에 0이 있으면 8진수
		int hexNum = 0x10; // 16진수 10, 10진수 16 -> 앞에 0x가 있으면 16진수
		int binNum = 0b10; // 2진수 10, 10진수 2 -> 앞에 0b가 있으면 2진수

		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int) c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // #은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(7), binNum); // Integer는 10진수 값을 2진수로 바꿔줌

	}

}
