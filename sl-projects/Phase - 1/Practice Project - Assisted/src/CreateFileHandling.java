import java.io.File;
import java.io.IOException;

public class CreateFileHandling {
	   public static void main(String args[]) throws IOException {
		   File t1 = new File("D:FileOperationExample.txt");
		   if (t1.createNewFile()) 
		   		{  
               System.out.println(t1.getName() + " file created");  
		   		} 		
		   else {  
               System.out.println("File already created");  
		   		} 
		   }   
	   }
