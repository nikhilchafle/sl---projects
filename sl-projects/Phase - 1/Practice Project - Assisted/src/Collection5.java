    import java.util.*;  
    public class Collection5{  
    public static void main(String args[]){  
    PriorityQueue<String> queue=new PriorityQueue<String>();  
    queue.add("Emp1");  
    queue.add("Emp2");  
    queue.add("Emp3");  
    queue.add("Emp4"); 
     
    Iterator<String> itr2=queue.iterator();  
    while(itr2.hasNext()){  
    System.out.println(itr2.next());  
    }  
    System.out.println("head:"+queue.element());  
    System.out.println("head:"+queue.peek());  
    
    queue.remove();  //removed 1st element
    queue.poll();   //removed 2nd element
    System.out.println("2 elements removed");  
    Iterator<String> itr3=queue.iterator();  
    while(itr3.hasNext()){  
    System.out.println(itr3.next());
    }  
    }  
    }  