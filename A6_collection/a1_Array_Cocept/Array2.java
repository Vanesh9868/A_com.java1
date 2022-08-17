package a1_Array_Cocept;

public class Array2 {

	public static void main(String[] args) {

		
		int a[]= new int [5];
		
		a[0]=10;
		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
		
/*
 * if we not use the declaire size of index then unused index will be gate wasted &
 * the default value of declaire variable datatype we get in output
 * 
 */
		
		for (int i =0;i < a.length;i++)
		{
			
			System.out.println(a[i]);
			
		}
		
		
		
		
	}

}
