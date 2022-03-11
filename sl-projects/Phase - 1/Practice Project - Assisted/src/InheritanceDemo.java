	class InheritanceDemo
	{  
		int PlotSize=1980;  
	}  
		class SecondClass extends InheritanceDemo	
	{   
		public static void main(String args[])	
		{  
			SecondClass p=new SecondClass();  
			System.out.println("area of plot"+p.PlotSize);   
		}  
	} 