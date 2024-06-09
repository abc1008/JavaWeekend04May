package pack1;

public class VariableDiscussion
{
	// global variables
	
	static int num = 10;
	static char c1 = 'R';
	static boolean b1 = true;
	static int num2;
	
	int num3 = 100;
	int num4;
	static int num5 = 950;   
    int num9 = 9500;   
	
	public void m1()
	{
		int num5 = 50;
		int num9 = 1900;
		// datatype variableName = value;
		
		System.out.println("num5 using variableName : "+ num5);
		
//		VariableDiscussion v1 = new VariableDiscussion();
//		System.out.println("num5 using object : " + v1.num5);
		
		System.out.println("num5 using variableName : "+ VariableDiscussion.num5);
		System.out.println("num9 using keyword :"+ this.num5);
		
//		System.out.println(num7);
	}
	
	public static void m2()
	{
		int num6 = 660;
		int num5 = 700;
		int num9 = 19000;
		// datatype variableName = value;
		System.out.println("num6 : " + num6);
		
		
//		System.out.println("num9 using keyword :"+ this.num5);
		
	}
	
	public static void main(String[] args)
	{
		
		// accessing static variable
		System.out.println(num);
		System.out.println(c1);
		System.out.println(b1);
		
		// not-recommended
		VariableDiscussion v1 = new VariableDiscussion();
		 int call = v1.num;
		 System.out.println(call);
		 
		 System.out.println("num2 : "+ num2);
		 
		 
		 // access non-static variable
		 System.out.println("num3 : "+v1.num3);
		 System.out.println("num4 : "+v1.num4);
		 
		 
		 // Local Variables
		 
		 m2();
		 v1.m1();

		 
	}
	

	

}
