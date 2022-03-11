interface Father
{  
    default void relation() 
    { 
        System.out.println("interface one"); 
    } 
} 
interface Son 
{  
    default void show() 
    { 
        System.out.println("interface two"); 
    } 
}  
public class DiamondProblem implements Father, Son 
{  
    public void relation() 
    {  
        Father.super.relation(); 
        Son.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        DiamondProblem db = new DiamondProblem(); 
        db.relation(); 
    } 
}
