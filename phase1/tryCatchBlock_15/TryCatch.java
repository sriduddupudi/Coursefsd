package tryCatchBlock_15;

public class TryCatch {
	 public static void main(String args[]) 
	    {
	        int[] array = new int[7];
	        try 
	        {
	            array[9] = 7;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size " + array.length);
	        }
	  }
}


