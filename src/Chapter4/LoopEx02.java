package Chapter4;

public class LoopEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		System.out.println("for ������ �̿��ϱ�");
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10������ ��:" + sum);
		System.out.println();
		System.out.println("while ������ �̿��ϱ�");
		sum = 0;
		i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1~10��������:" + sum);
		System.out.println();
		System.out.println("do while ������ �̿��ϱ�");
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println("1~10������ ��:" + sum);
	}
}
