
public class InnerClass
{
	public static void main(String[]args) 
	{
		Out.Inner Ot = new Out(). new Inner();
		Ot.dis();
	}

}

class Out
{
	class Inner
	{
		public void dis() 
		{
		System.out.println("This is an example of inner class");
		}
	}
}