    import java.util.*;  
    public class Collection2{  
    public static void main(String args[])
    {  
    LinkedList<String> ll=new LinkedList<String>();  
    
    ll.add("Ankit");  
    ll.add("Akshay");  
    ll.add("Ayush");  
    ll.add("Aarav"); 
    ll.add("Ashwin"); 
    Iterator<String> it = ll.iterator();  
    while(it.hasNext())
    {  
    System.out.println(it.next());  
    }  
   }  
  }  