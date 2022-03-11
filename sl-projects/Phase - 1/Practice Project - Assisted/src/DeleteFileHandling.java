import java.io.File;

import java.io.IOException;

public class DeleteFileHandling {
	   public static void main(String args[]) throws IOException {
		   File t1 = new File("D:FileOperationExample.txt");   
		   t1.delete();
		   System.out.println(t1.getName()+ " deleted");  
		   }   
	   }
