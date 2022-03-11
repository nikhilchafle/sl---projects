import java.io.FileWriter;
import java.io.IOException;

public class ReadFileHandling {
	   public static void main(String args[]) throws IOException {
		   
		   FileWriter fwrite = new FileWriter("C:FileOperationExample.txt");  
	  	   fwrite.write("file is updated or written");   
	       fwrite.close();   
	       System.out.println("file wtite complete");  
		   }   
	   }
