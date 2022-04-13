package Methodreturntype4;

public class Return_Type {
	int m1()
	  { 
	   System.out.println("m1 method:"); 
	      return 4451; 
	  } 
	  float m2() 
	  { 
	    System.out.println("m2 method:"); 
	      return 7650.2f; 
	  } 
	  String m3()
	  { 
	    System.out.println("m3 method:"); 
	     return "hello"; 
	  } 
	  double m4()
	  {
		  System.out.println("m4 method:");
		  return 263.4;
	  }
	  char m5()
	  {
		  System.out.println("m5 method:"); 
		     return 's'; 
	  }
	public static void main(String[] args)
	 { 
		Return_Type s = new Return_Type();
	      int i = s.m1(); 
	    System.out.println("Return value of m1 method is " +i); 
	    float f = s.m2();
	    System.out.println("Return value of m2 method is " +f); 
	    String str = s.m3(); 
	    System.out.println("Return value of m3 method is " +str);
	    double d = s.m4(); 
	    System.out.println("Return value of m4 method is " +d);
	    char ch = s.m5(); 
	    System.out.println("Return value of m5 method is " +ch);
	  } 
}
