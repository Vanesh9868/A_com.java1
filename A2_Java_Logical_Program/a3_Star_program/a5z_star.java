package a3_Star_program;

public class a5z_star {

	public static void main(String[] args) {
	
		for (int i=1;i<=4;i++)
		{		
			for(int a=4; a>=i; a--)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			for (int b=1; b<=i; b++)
			{		
				System.out.print(" ");
			}
					
		}
		System.out.println();
		
		
		for(int x=2; x<=5;x++)
		{
			for(int y =1;y<=x;y++)
			{
				System.out.print(" ");
			}
			
			for (int z=3;z>=x;z--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
