    import java.util.*;  
    public class Collection7{  
    public static void main(String args[]){  
    LinkedHashSet<String> set=new LinkedHashSet<String>();  
    set.add("Leven");  //maintain insertion order
    set.add("Twelve");  
    set.add("Thirteen");  
    set.add("Fourteen");  
    Iterator<String> itr=set.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
    }  
    }  