package Chapter3;

public class OpEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'a';	// a = �ƽ�Ű�ڵ尪 97
		char c2 = c1;	
		char c3 = ' ';	// c3�� �������� �ʱ�ȭ

		int i = c1 + 1;			// 	i = 98
		c3 = (char) (c1 + 1); 	// c3 = 98 = b
		c2++;					// c2 = 98 = b
		c2++;					// c2 = 99 = c

		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
	}

}
