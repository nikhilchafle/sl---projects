    import java.util.*;  
    public class Collection6{  
    public static void main(String args[]){  
    
    HashSet<String> set=new HashSet<String>();  
    set.add("S1");  
    set.add("S2");  //dosen't maintain order
    set.add("S3");  //use hash table for storage
    set.add("S2");  //duplicates dosen't allow
    
    Iterator<String> itr=set.iterator();  
    while(itr.hasNext())
    {  
    System.out.println(itr.next()); 
    }  
    }  
    }  