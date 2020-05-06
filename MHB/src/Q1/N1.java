package Q1;

public class N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 잘못된 문장을 고쳐서 에러가 발생하지 않도록 수정하시오.
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		var4 = var1;
		System.out.println(var1 + ", " + var2);
		var1 = var3; 							-> 큰값을 작은값에 대입할 때 캐스팅(형변환), byte<int
		System.out.println(var1 + ", " + var3);

		float var5 = 123456.789123;
		double var6 = 123456.789123;
		var5 = var6; 							-> 큰값을 작은값에 대입할 때 캐스팅(형변환), float<double
		System.out.println(var5 + ", " + var6);
		var6 = var5;
		System.out.println(var5 + ", " + var6);		*/
		
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		
		var4 = var1; 							// var4= 128->127
		System.out.println(var1 + ", " + var2); // 127, 128
		var1 = (byte)var3; 						// var1= 127->-128(값의 범위를 넘어서 음수가 됨)
		System.out.println(var1 + ", " + var3); // -128, 128

		float var5 = 123456.789123f; 			// float타입 접미사 f
		double var6 = 123456.789123; 			// double의 d는 생략가능
		
		var5 = (float)var6; 					// var5= 123456.789123f->123456.79(값의 범위를 넘어서 반올림 됨)
		System.out.println(var5 + ", " + var6); // 123456.79, 123456.789123
		var6 = var5; 							// var6= 123456.789123->123456.7890625(값이 변질됨)
		System.out.println(var5 + ", " + var6); // 123456.79, 123456.7890625

	}

}
