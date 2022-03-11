import java.io.*;
public class FileHandling {
   public static void main(String[] args) throws Exception {
      try {
         BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
         out.write("FirstString\n");
         out.close();
         out = new BufferedWriter(new FileWriter("filename",true));
         out.write("SecondString\n");
         out.close();
         BufferedReader in = new BufferedReader(new FileReader("filename"));
         String str;
         
         while ((str = in.readLine()) != null) {
            System.out.println(str);
         }
      
      in.close();}
      catch (IOException e) {
         System.out.println("exception occoured"+ e);
      }
   }
}