package a3_Star_program;

public class a3_star_program {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int a = 3; a > 0; a--) {
			for (int b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
