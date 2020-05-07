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

		int octNum = 010; // 8���� 10, 10���� 8 -> �տ� 0�� ������ 8����
		int hexNum = 0x10; // 16���� 10, 10���� 16 -> �տ� 0x�� ������ 16����
		int binNum = 0b10; // 2���� 10, 10���� 2 -> �տ� 0b�� ������ 2����

		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int) c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // #�� ���λ�(16���� 0x, 8���� 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(7), binNum); // Integer�� 10���� ���� 2������ �ٲ���

	}

}
