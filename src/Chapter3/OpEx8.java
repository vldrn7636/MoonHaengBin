package Chapter3;

public class OpEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1000000;
		int b = 2000000;

		long c = a * b;
		// double c = (double)a * (double)b;
		
		System.out.println(c);
		// 범위를 벗어나서 -1454759936라는 이상한 값이 나옴
	}

}
