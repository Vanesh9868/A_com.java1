package a1_Array_Cocept;

public class Array3 {

	public static void main(String[] args) {
		
		
		String a[] = new String [5];     // declair the array with index size
		
		a[0]="yogesh";
		
/*
 * 
 * if we not initialise the variable then till provided index
 * the default value of declaire variable datatype we get in output
 * 
 */
		
		
		for (int i=0;i< a.length; i++)
		{
			
			System.out.println(a[i]);
			
		}
		

	}

}
