package a7_Array;

public class o1_String_dublicate_remove {

	public static void main(String[] args) {
		
		String [] a= {"yogesh" , "Shinde" ,"yogesh", "Tester","yogesh"};
		
				
		for(int i=0; i<=a.length-1;i++)
		{

			for(int j =0;j<=a.length-1;j++)
			{
				if(a[i]!=a[j])
				{
					System.out.println(a[j]);
					break;
				}
			}
						

		}
		
		
		
		
		

	}

}
