    import java.util.*;  
    public class Collection4{  
    public static void main(String args[]){  
    Stack<String> stack = new Stack<String>();  
    stack.push("Five");  
    stack.push("Six");  
    stack.push("Seven");  
    stack.push("Eight");  
    stack.push("Nine");  
    stack.pop();  
    Iterator<String> itr=stack.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
    }  
    }  