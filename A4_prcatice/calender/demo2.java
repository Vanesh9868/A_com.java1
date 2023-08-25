package calender;

public class demo2 {

	public static void main(String[] args) {
	
		String myString = "1,2,3,4,5";
		String[] myArray = myString.split(",");
	
//		int[] expectedArray = { 1, 2, 3, 4, 5 };
//		int[] actualArray = new int[myArray.length];
//		for (int i = 0; i < myArray.length; i++) {
//			actualArray[i] = Integer.parseInt(myArray[i]);
//		}
//		Assert.assertArrayEquals(expectedArray, actualArray);
		
		System.out.println(myArray[0]);
	}

}
