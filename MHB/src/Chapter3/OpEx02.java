package Chapter3;

public class OpEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5, y = 0;
		y = x++;									// y�� x�� 5���� �Ŀ� x�� 1�����Ͽ� 6 
		System.out.println("x=" + x + ",y=" + y);	

		y = ++x;									// x�� 1�����Ͽ� 7�� �ǰ� y�� 7����
		System.out.println("x+" + x + ",y=" + y);
		System.out.println("x+" + x++);				// 7��� �� 1�����Ͽ� 8
		System.out.println("x+" + ++x);				// 1�����Ͽ� 9�ǰ� 9���

		x = y--;									// x�� �� 7���� �Ŀ� y�� 1�����Ͽ� 6
		System.out.println("x=" + x + ",y=" + y);

		x = --y;									// y�� 1�����Ͽ� 5�� �ǰ� x�� 5����
		System.out.println("x=" + x + ",y=" + y);

	}

}
