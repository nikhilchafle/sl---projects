    public class ExceptionHandlingEx {  
      
        public static void main(String[] args) {  
            try  
            {  
            int rollno=99/0;
            }   
            catch(ArithmeticException e)  
            {  
                System.out.println(e);  
            }  
            System.out.println("rest of the code");  
        }  
          
    }  