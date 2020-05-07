package EXAM;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "단\t");								// 몇단이지 출력
		}
		for (int i = 2; i <= 9; i++) {
			System.out.print("\n");
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");	// println 대신 print를 사용하여 가로로 출력함
			}

		}

	}
}
