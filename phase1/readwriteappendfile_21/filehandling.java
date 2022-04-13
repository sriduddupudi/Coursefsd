package readwriteappendfile_21;
import java.io.*;
public class filehandling {

	 public static void main(String[] args){
	 //Writing in the file

	 try
	 {                                    
	FileWriter f = new FileWriter("C:/Users/u/Desktop/FileHandling.txt");
	 try
	 {
	 f.write("Srinivas is the employee of a Company..!!");
	 }
	 finally
	 {
	 f.close();
	 }
	 System.out.println("Successfully Written..!! ");
	 }
	 catch(IOException i)
	 {
	 System.out.println(i);
	 }


	 
	  //Reading an Existing file
	  try
	  {
	  FileReader r = new FileReader("C:/Users/u/Desktop/FileHandling.txt");

	  try
	  {
	  int i;
	 while((i=r.read())!=-1)
	  {
	  System.out.print((char)i);
	  }
	  }
	  finally
	  {
	  r.close();
	  System.out.print("\n");
	  System.out.print("File Closed successfully.");
	  }
	  }
	  catch(IOException e)
	  {
	  System.out.println("Exception handled..");
	  }
	 
	   // Append text to Existing File.
	   String path = ("C:/Users/u/Desktop/FileHandling.txt");
	   String text = " Currently doing training at Simplilearn";
	   try
	   {
	   FileWriter f = new FileWriter(path,true);
	   f.write(text);
	   f.close();
	   System.out.println("Append done Successfully..");
	   }
	   catch(IOException e){
	   System.out.println(e);
	   }
	   }
	  }

