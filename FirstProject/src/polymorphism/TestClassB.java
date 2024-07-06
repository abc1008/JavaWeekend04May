package polymorphism;

public class TestClassB extends TestClassA
{
	
	int var1 = 500;
	int var3 = 300;
	
	
	// overloaded 
	public void m1(boolean a, int b)
	{
		System.out.println("2 arg m1 method of TestClassB");
	}
	
//	 overridden method
	public void m1()
	{
		System.out.println("0 arg m1 method of TestClassB");
	}
	
//	 overridden method
	public void m2()
	{
		System.out.println("0 arg m2 method of TestClassB");
	}
	
	public static void m5()
	{
		System.out.println("static m5 method of TestClassB");
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println(" ******* child class ref + child class object ******* ");
		System.out.println();
		
		TestClassB b1 = new TestClassB();    // child class ref + child class object 
		b1.m1();						// overridden
		b1.m1(false, 6);   			// overloaded 
		b1.m2();
		b1.m5();
		
		System.out.println();
		System.out.println(" ******* parent ref + parent object ******* ");
		System.out.println();
		
		TestClassA a1 = new TestClassA();  // parent ref + parent object
		a1.m1();						// overridden
		a1.m1(0);                  // overloaded 
		a1.m2();
		
		a1.m5();
		
		System.out.println();
		System.out.println(" ******* parent ref + child object ******* ");
		System.out.println();
		
		TestClassA a2 = new TestClassB();  // parent ref + child object
		a2.m1();    			// overridden
		a2.m1(0);				// overloaded 	
		
		a2.m5();  			// not overridden  (method hiding)
		
		
//		TestClassB ab = new TestClassA();   // not possible in java 
		
//		System.out.println();
//		System.out.println(" ******* polymorphism w.r.t. variables ******* ");
//		System.out.println();
//		
//		System.out.println(b1.var1);	// child ref
//		System.out.println(a1.var1);    // parent ref
//		System.out.println(a2.var1);   // parent ref
		
		
//		System.out.println(b1.var2);   // inheritance 
//		System.out.println(b1.var3);

		
		
	}
	
	
	
	
}
