package Dayz_19;

public class String_builder {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
