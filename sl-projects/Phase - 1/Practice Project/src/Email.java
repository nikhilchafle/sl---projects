import java.util.Arrays;
import java.util.Scanner;
 
public class Email {  
        public static void main(String[] args) {  
        	 String[] sa = { "n1@gmail.com", "n2@gmail.com", "n3@gmail.com" }; 
           
            System.out.println(Arrays.toString(sa)); 
            System.out.println("Enter Array To Be Search");
            Scanner sc=new Scanner(System.in);
            String str= sc.nextLine();
            String s = str;
            boolean x = false; 
            int in = 0;
            for (int i = 0; i < sa.length; i++) {  
                if(s.equals(sa[i])) 
                {  
                    in = i; x = true; break;  
                }  
            }
            if(x)  
                System.out.println(s +" String is found at index "+in);  
            else  
                System.out.println(s +" String is not found in the array");  
        }    
        }
        