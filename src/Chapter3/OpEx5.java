package Chapter3;

public class OpEx5 {
// 비트연산자: 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("6&3=" + (6 & 3)); // AND,& :양쪽 모두 1이어야 1
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * --------
		 * &   0010	= 2
		 */
		System.out.println("6|3=" + (6 | 3)); // OR,| : 하나라도 1이면 1
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * -------- 
		 * | : 0111 = 7
		 */
		System.out.println("6^3=" + (6 ^ 3)); // XOR,^ : 서로 달라야 1 같으면 0
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * --------
		 * ^ : 0101 = 5
		 */
		System.out.println("~10=" + ~10);	// ~ :비트전환연산자-> 2진수로 표현했을 때 0은 1로 1은 0으로, 양수->음수, 음수->양수
		/*
		 *10 : 00001010 (양수)				
		 *---------
		 * ~ : 11110101 (음수) : -11	    	// 1의 보수
		 */

	}

}
