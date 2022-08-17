package Day4_method;

public class a4_Return_syso {
		    
		public static byte  m1   () 
		{
			System.out.println(1111);
		    return 7;
		}     
		
		public static short  m2   () 
		{
		    System.out.println(20);
			return 2;
		}     
		
		public static int   m3  ()    
		{
		    System.out.println(100);
			return 3;
		} 
		
		public static float  m4   () 
		{
		    System.out.println(10.11f);
			return 1.1f;
		}     
		
		public static double  m5   () 
		{
		    System.out.println(20.20);
			return 2.2;
		}     
		
		public static long  m6   () 
		{
		    System.out.println(10000);
			return 5;
		}     
		
		
		public static char  m7     ()
		{ 
		    System.out.println('1');
			return 'a'; 
		} 
		
		public static String m8  ()
		{
			System.out.println("yoesh");
		    return "b";    
		}
		
		public static boolean  m9   () 
		{
			System.out.println(true);
			return true;
		}     
		
		public static  void  m10 ()
		{
		    System.out.println("yogesh");
		}


	public static void main(String[] args) {

		a4_Return_syso obj = new a4_Return_syso ();
		
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
		obj.m6();
		obj.m7();
		obj.m8();
		obj.m9();
		obj.m10();

		a4_Return_syso.m1();
		
		
	}

}
