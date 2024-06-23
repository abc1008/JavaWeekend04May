package oops_learning;

public class ClassB extends ClassA
{
	int a = 1000;   // non-static
	static int b = 60000;
	
	int c = 900;  // non-static variable
	
	public void m2()
	{
		int c =800; 
		System.out.println("parent class non-static variable  : "  + super.a); 
		System.out.println("static variable of parent class : " +ClassA.b);
		
		System.out.println(c);
		System.out.println(this.c);

	}
	
	public static void main(String[] args)
	{
		ClassB bb = new ClassB();
		bb.m1();
		bb.m2();
		
		System.out.println(bb.a);
		System.out.println(b);
		
		System.out.println("static variable of parent class : " +ClassA.b);
	}
	
	
	
}
