class Constructor{  
    int id;  
    String name;  
      
    Constructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
     
    	Constructor s1 = new Constructor(123,"Vaibhav");  
    	Constructor s2 = new Constructor(292,"Raj");  
    	Constructor s3 = new Constructor(999,"Nayan");
    	Constructor s4 = new Constructor(999,"Nayan"); 
     
    s1.display();  
    s2.display();  
    s3.display();
    s4.display();
   }  
}  