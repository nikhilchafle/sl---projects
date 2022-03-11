class WaitEx
{
	private static Object obj = new Object();	
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("thread Example Started");
		Thread.sleep(5000);
		System.out.println("thread of 5sec is over");
		
		synchronized(obj)
		{
			System.out.println("wait will continue here");
			obj.wait(5000);
			System.out.println("wait of 5 sec is over ");
		}
		
		System.out.println("Thread woken up .");
	}
}