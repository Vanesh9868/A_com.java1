package c1_overloadind;   // change the sequence of argument

public class activa_SequenceChange {
	
	public void run (int a,String b)                      // 1
	{
		System.out.println("run at 45");
	}
	
	public void run (String a , int b)                    // 2
	{
		System.out.println("run at 70");
	}
	
	public static void main(String[] args) {
		
		activa_SequenceChange Z = new activa_SequenceChange ();
		
		Z.run(10,"abc");
		Z.run("abc",12);
		
	}

}
