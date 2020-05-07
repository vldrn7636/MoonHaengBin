package Chapter3;

public class OpEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("8<<2 : " + (8 << 2));

		System.out.println("8>>2 : " + (8 >> 2));
		/*
		 * 8 	: 00001000 
		 * >>2 	: 00000010	= 2
		 */
		System.out.println("8>>>2 : " + (8 >>> 2));
		
		System.out.println("-8<<2 : " + (-8 << 2));
		/*
		 * -8	: 11111000
		 * >>2	: 11100000 = -32
		 */
		System.out.println("-8>>2 : " + (-8 >> 2));
		
		System.out.println("-8>>>2 : " + (-8 >>> 2));
	}

}
