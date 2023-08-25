package Dayz15_ExceptionHAndling;

public class try_2 {

	public static void main(String[] args) {

		int a = 5;
		for (int i = 0; i < 10; i++) {

			try {
				if (i > a) {
					System.out.println(i);
					break;
				}
			} catch (Exception e) {
				System.out.println("catch");
			}

		}

	}

}
