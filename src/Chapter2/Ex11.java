package Chapter2;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;

		System.out.printf("    123456789012345678901234%n");
		System.out.printf("f  : %f%n", f); // 소수점 이하 6째자리까지 출력
		System.out.printf("f  : %24.20f%n", f); //
		System.out.printf("f2 : %24.20f%n", f2); // 표현범위를 넘어버려서 이상한 값으로 변함 (무한대?)
		System.out.printf("4d : %24.20f%n", d); // double로도 다 표현이 불가

	}

}
