package Dayz13_Array;

import java.util.Arrays;

public class test2 {
	
	public static int addition(int[] a) {
		int sum = 0;
		int[] array = a;
		Arrays.sort(array);
		for (int i = 1; i < array.length - 1; i++) {
			sum = sum + array[i];
		}
		return sum;
	}


	public static void main(String[] args) {

		int[] a = { 40,30,20,10 };

		System.out.println(addition(a));
	}

}
