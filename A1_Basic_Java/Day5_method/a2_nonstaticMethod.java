package Day5_method;    //non static or instance method

public class a2_nonstaticMethod {
				
		public void   cat   () 
		{
			System.out.println("eat milk");
		}    
		
		public void   horse () 
		{
			System.out.println("run fast");
		}
		
		public void   birds () 
		{
			System.out.println("fly ");
		} 
		

public static void main(String[] args) {

  a2_nonstaticMethod Z = new a2_nonstaticMethod ();
                                                 //non static method
        Z.cat  ();                               //object name.method name();
        Z.horse();
        Z.birds();
		
	
	}

}
