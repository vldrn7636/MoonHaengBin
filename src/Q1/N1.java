package Q1;

public class N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. �߸��� ������ ���ļ� ������ �߻����� �ʵ��� �����Ͻÿ�.
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		var4 = var1;
		System.out.println(var1 + ", " + var2);
		var1 = var3; 							-> ū���� �������� ������ �� ĳ����(����ȯ), byte<int
		System.out.println(var1 + ", " + var3);

		float var5 = 123456.789123;
		double var6 = 123456.789123;
		var5 = var6; 							-> ū���� �������� ������ �� ĳ����(����ȯ), float<double
		System.out.println(var5 + ", " + var6);
		var6 = var5;
		System.out.println(var5 + ", " + var6);		*/
		
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		
		var4 = var1; 							// var4= 128->127
		System.out.println(var1 + ", " + var2); // 127, 128
		var1 = (byte)var3; 						// var1= 127->-128(���� ������ �Ѿ ������ ��)
		System.out.println(var1 + ", " + var3); // -128, 128

		float var5 = 123456.789123f; 			// floatŸ�� ���̻� f
		double var6 = 123456.789123; 			// double�� d�� ��������
		
		var5 = (float)var6; 					// var5= 123456.789123f->123456.79(���� ������ �Ѿ �ݿø� ��)
		System.out.println(var5 + ", " + var6); // 123456.79, 123456.789123
		var6 = var5; 							// var6= 123456.789123->123456.7890625(���� ������)
		System.out.println(var5 + ", " + var6); // 123456.79, 123456.7890625

	}

}
