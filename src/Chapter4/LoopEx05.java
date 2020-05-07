package Chapter4;

public class LoopEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for (int j = 2; j <= 9; j++) {
				if (j == 5) break;				// x5 까지만 출력
				if (j == 5) continue;			// x5만 뺴고 출력
				System.out.println(i + "x" + j + "=" + (i * j));
			}

		}

	}
}