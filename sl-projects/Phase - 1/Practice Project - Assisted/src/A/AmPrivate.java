package A;

public class AmPrivate extends B{

	public static void main(String[] args) {
	B obj = new B();
	obj.display();
	}

}

class B{
	private void meth() {
		System.out.println("this is private method");
	}
}