package Dayz18_String;

import java.util.Random;

public class RandomClass {

	static int num1;
	static int num2;

//	public static String randomNumber(int number) {
//		Random random = new Random();
//		int a = random.nextInt(number);
//		if (a > 1000 & a != 0) {
//			num1 = a;
//		}
//		if (num1 == 0) {
//			num1 = number;
//		}
//
//		int c = random.nextInt(number);
//		if (c > 1000 & c != 0) {
//			num2 = c;
//		}
//		if (num2 == 0) {
//			num2 = number;
//		}
//
//		return num1 + "" + num2;
//	}

	public static String randomNumber(int number, int lenght) {
		Random random = new Random();
		int result = 0;
		for (int i = 0; i < 100; i++) {
			int a = random.nextInt(number);
			int b = random.nextInt(number);

			if (String.valueOf(a).length() == lenght && String.valueOf(b).length() == lenght) {
				result = a + b;
			}
		}

		return String.valueOf(result);
	}

	public static void main(String[] args) {

//		Random num = new Random();
//
//		System.out.println(num.nextInt(123456));
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println(num.nextInt(123456));
//		}

		System.out.println(randomNumber(10000, 5));
	}

}
