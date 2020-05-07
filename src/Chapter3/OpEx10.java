package Chapter3;

public class OpEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = 'a';
		for(int i=0; i<26; i++) 		
		{
			System.out.println(c++);
			}
		System.out.println();			// ÁÙ¹Ù²Þ
		
		c = 'A';
		for(int i=0; i<26; i++)
		{
			System.out.println(c++);
			}
		System.out.println();
		
		c='0';
		for(int i=0; i<10; i++)
		{
			System.out.println(c++);
			}
		System.out.println();
	}
}
