package Chapter3;

public class OpEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'a'; 					// 'a': �ڵ尪97
		char c2 = c1;
		char c3 = ' ';

		int i = c1 + 1;					// 97+1=98, 98='b'

		c3 = (char) (c1 + 1);			// �������� �������� ���ϴ� ���������� ��ȯ�� ->int���� ������ int��, c3�� �������̶� ���������� ĳ����(����ȯ)
		c2++;
		c2++;							// 99='c'

		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);

	}

}
