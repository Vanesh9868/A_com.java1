package a1_Array_Cocept;

public class Array_1 {

	public static void main(String[] args) {
	
		int a[]= new int [5];          // declaire the array
		
	a[0]=10;                           // inititialise the array
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
//	a[6]=70;
//	a[7]=80;
//	a[8]=90;
	
		System.out.println("yogesh");
		
	for (int i = 0;i<a.length;i++)
	{
		
		System.out.println(a[i]);
	
	}

	
	}
	
	
	
/*
 * Array starts from index 0 
 * 
 * it will allow to initialise till the value declaire in the array "new int[5]"
 * 
 * if index 5 is decliare then we have to initialise value with all index 0,1,2,3,4
 * 
 * if index 5  are declaire then we have to use only index 0,1,2,3,4 if we try
 * use initialse with index 5 / 6 / 10 the exception will be thrown
 * 
 * if index 5  are declire and we just initilise at index 0,1 the remaining 2,3,4 
 * are get wasetd and the output on console for index 2,3,4 will be a default value of data type
 * 	
 */

}





