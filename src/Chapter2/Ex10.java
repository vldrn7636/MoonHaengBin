package Chapter2;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short sMin = -32768; // short�� ���� -> -32,768~32,767
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535; // char�� ���� -> 0~65535

		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1= " + (short) (sMin - 1)); // �ּҰ��� ������ �Ѿ������ �ִ밪�� ���� 
		System.out.println("sMin-100= " + (short) (sMin - 100));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short) (sMax + 1));
		System.out.println("cMin = " + (int) cMin);
		System.out.println("cMin-1= " + (int) --cMin);
		System.out.println("cMax =" + (int) cMax);
		System.out.println("cMax+1= " + (int) ++cMax);

		System.out.println(Integer.toBinaryString(sMin));
		System.out.println(Integer.toBinaryString(sMin - 1));

	}

}
