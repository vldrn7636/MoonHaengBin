package Chapter3;

public class OpEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5, y = 0;
		y = x++;									// y에 x값 5대입 후에 x는 1증가하여 6 
		System.out.println("x=" + x + ",y=" + y);	

		y = ++x;									// x가 1증가하여 7이 되고서 y에 7대입
		System.out.println("x+" + x + ",y=" + y);
		System.out.println("x+" + x++);				// 7출력 후 1증가하여 8
		System.out.println("x+" + ++x);				// 1증가하여 9되고서 9출력

		x = y--;									// x에 값 7대입 후에 y는 1감소하여 6
		System.out.println("x=" + x + ",y=" + y);

		x = --y;									// y가 1감소하여 5가 되고서 x에 5대입
		System.out.println("x=" + x + ",y=" + y);

	}

}
