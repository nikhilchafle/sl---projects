class VaccineException  extends Exception  
{  
    public VaccineException (String str)  
    {  
       super(str);  
    }  
}  
    
public class CustomDemo  
{  
  
    static void validate (int age) throws VaccineException{    
       if(age < 18){  
  
        throw new VaccineException("not allowed to take vaccine");    
    }  
       else {   
        System.out.println("you are allowed to take vaccine");   
        }   
     }    
  
public static void main(String args[])  
    {  
        try  
        {   
            validate(13);  
        }  
        catch (VaccineException ex)
        {  
            System.out.println("Caught the exception");  
            System.out.println("Exception occured: " + ex);  
        }  
        System.out.println("rest of the code...");    
    }  
}  