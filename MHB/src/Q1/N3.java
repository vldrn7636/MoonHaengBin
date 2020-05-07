package Q1;

public class N3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 3. 다음 프로그램을 컴파일 했을 때 결과를 추측해보시오.
		 * byte b= 127; 
		 * byte c= 126; 
		 * byte d= b+c;		*/
		byte b= 127;
		byte c= 126; 
		int d = b + c;			// byte로는 값의 범위를 넘어섬
		System.out.println(d);	// 253

	}

}
