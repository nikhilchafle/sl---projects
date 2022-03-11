    import java.util.*;  
    class Collection{  
    public static void main(String args[]){  
    ArrayList<String> AL=new ArrayList<String>();
    
    AL.add("Nick");
    AL.add("James");  
    AL.add("Webb");  
    AL.add("Telescope");  
    AL.add("Next"); 
    AL.add("Space"); 
  
    Iterator IT=AL.iterator();  
    while(IT.hasNext())
    {  
    System.out.println(IT.next());  
    }  
    }  
    }  