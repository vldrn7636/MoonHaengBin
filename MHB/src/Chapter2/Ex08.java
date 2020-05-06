package Chapter2;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "www.codechobo.com";

		float f1 = .10f; // 0.10
		float f2 = 1e1f; // 10.0
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // ��ü 14�ڸ� �� �Ҽ��� 10�ڸ�

		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // ������ ����
		System.out.printf("[%.8s]%n", url); // ���ʿ��� 8���ڸ� ����

	}

}
