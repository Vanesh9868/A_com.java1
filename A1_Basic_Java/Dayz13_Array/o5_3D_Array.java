package Dayz13_Array;

public class o5_3D_Array {

	public static void main(String[] args) {

		int [][][] a = {{{10,20},{30,40,50,60},{70,80,90}}};
		
		System.out.println("a = "+a.length);
		System.out.println("a[0] = "+a[0].length);
		System.out.println("a[0][0] = "+a[0][0].length);
		System.out.println("a[0][1] = "+a[0][1].length);
		System.out.println("a[0][2] = "+a[0][2].length);
		System.out.println();
		
		
		for (int i =0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				for (int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+",");
				}
				System.out.println();
				
			}
			
		}

		
		
		
		
		
}

}
