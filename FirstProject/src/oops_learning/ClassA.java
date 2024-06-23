package oops_learning;

public class ClassA
{
	// Global 
	int a = 10;   // non-static
	static int b = 60;
	
	public void m1()
	{
//		System.out.println(super.c);
		int c = 100;
		System.out.println("m1 method of ClassA");
	}
	public static void main(String[] args)
	{
		ClassA aa = new ClassA();
		aa.m1();
		System.out.println(aa.a);
		
		ClassB bb = new ClassB();
		System.out.println(bb.c);
		
		
		
	}
	
	
	
}
