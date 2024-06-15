package pack1;

public class ConstructorBasics
{
	
	int a;
	int b = 100;
//	static int p = 90;
	
//		 public ConstructorName()
//		{
//			// body of constructor
//		}
	
	public ConstructorBasics()
	{
		System.out.println("Zero arg Constructor of ConstructorBasics class.");
	}

	
	public ConstructorBasics(int x, int y)
	{
		System.out.println("2 arg : int x, int y Constructor of ConstructorBasics class.");
		a = x;
		b = y;
		
	}
	
	public ConstructorBasics(int p, double q)
	{
		System.out.println("2 arg :  int p, double q Constructor of ConstructorBasics class");
	}
	
	public ConstructorBasics(double q, int p)
	{
		System.out.println("2 arg :  double q, int p Constructor of ConstructorBasics class");
	}
	
	public ConstructorBasics(String q)
	{
		this(60,9);  // calling of 2 arg constructor
		System.out.println("1 arg Constructor of ConstructorBasics class : String q");
	}
	
	public void m44()
	{
		
	}
	
	public static void main(String[] args)
	{
		
//		ConstructorBasics c1 = new ConstructorBasics(8,7);
//
//		System.out.println(c1.a);
//		System.out.println(c1.b);
//		
//		
//		ConstructorBasics c3= new ConstructorBasics(90,75);
//		System.out.println(c3.a);
//		System.out.println(c3.b);
		
//		ConstructorBasics c2= new ConstructorBasics(60.5, 84);
		
		ConstructorBasics c6= new ConstructorBasics("ee");
		
		
		
		
		
	}
	
	
	
	

}
