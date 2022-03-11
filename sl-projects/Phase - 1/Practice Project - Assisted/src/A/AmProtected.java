package A;

public class AmProtected extends BB {
	//Except outside package can be access everywhere
	public static void main(String[] args) {
		BB obj = new BB();
		obj.meth2();

	}

}
class BB{
	protected void meth2() {
		System.out.println("this is protected method");
	}
}