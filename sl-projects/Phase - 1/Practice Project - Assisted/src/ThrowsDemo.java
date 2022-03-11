class ThrowsDemo
{
    static void fun() throws IllegalAccessException
    {
        System.out.println("Ex1");
        throw new IllegalAccessException("errork");
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
    }
}