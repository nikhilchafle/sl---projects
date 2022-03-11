    import java.util.*;  
    class Maps{  
     public static void main(String args[]){  
      Map<Integer,String> map=new HashMap<Integer,String>();  
      
      map.put(100,"Raj");  
      map.put(101,"Nayan");  
      map.put(102,"Rohit");  
      map.put(102,"Rohit"); //not showing duplicate value
      map.put(102,"Rohit"); 
      
      for(Map.Entry m:map.entrySet()){  
       System.out.println(m.getKey()+" "+m.getValue());  
      }  
     }  
    }  