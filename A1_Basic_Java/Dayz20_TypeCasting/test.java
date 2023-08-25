package Dayz20_TypeCasting;

class parent {

	public void parent() {
		System.out.println("parent class function");
	}
}

class child extends parent {

	public void parent() {
		System.out.println("parent class overrided function");
	}

	public void child() {
		System.out.println("child class function");
	}

}

public class test {

	public static void main(String[] args) {
		parent p1 = new parent();

		p1.parent();

		parent p = new child();

		p.parent();

		child c = (child) p;

		c.child();
	}

}
