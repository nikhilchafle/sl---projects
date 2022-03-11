    public class ThrowDemo {   
          
        public static void entry(int Jab) {  
            if(Jab<18) {  
                
                throw new ArithmeticException("not vaccinated");    
            }  
            else {  
                System.out.println("vaccinated");  
            }  
        }  
         
        public static void main(String args[]){  
            
            entry(13);  
            System.out.println("rest of the code...");    
      }    
    }    