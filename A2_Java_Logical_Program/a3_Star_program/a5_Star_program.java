package a3_Star_program;

public class a5_Star_program {

	public static void main(String[] args) {

	for (int i=1;i<=4;i++)
	{		
		for(int a=4; a>=i; a--)
		{
			System.out.print("*");
		}
		
		System.out.println();
		
		if(i==4)
		{
			break;
		}
		
		
		for (int b=1; b<=i; b++)
		{		
			System.out.print(" ");
		}
				
	}
	
	
	
	for (int x=2;x<=4;x++)
	{
		for(int y=3;y>=x; y--)
		{
			System.out.print(" ");
		}
		
		for (int z=1;z<=x; z++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		
	}
	
	
	
	
		
		
}

}
