package Dayz19_LambdaExpressions;

@FunctionalInterface
interface Ducati {
	void highSpeed(String messege);
}

class b implements Ducati {

	@Override
	public void highSpeed(String messege) {
		System.out.println("High Speed : " + messege);
	}

}

public class demo {

	public static void main(String[] args) {

		Ducati y = (String messege) -> {
			System.out.println("sdfghjk" + messege);
		};

//		Ducati ducati = (String messege) -> {
//			System.out.println("Highest Speed : " + messege);
//		};
//
//		ducati.highSpeed("1000kmph");

//		Ducati x = new b();
//
//		x.highSpeed("1000kmph");

	}

}
