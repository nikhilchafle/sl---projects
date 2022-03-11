class FinallyDemo
{
    static void fun() throws IllegalAccessException
    {
        System.out.println("Ex1");
        throw new IllegalAccessException("error");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("ex2");
        }
        finally 
        {
        	System.out.println("this is fanally block");
        }
    }
}