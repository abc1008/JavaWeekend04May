package oops_learning;

public class ClassC extends ClassA
{
	public void m2()
	{
		System.out.println("m2 of ClassC");
	}
	
	
	public static void main(String[] args)
	{
		ClassC cc = new ClassC();
		cc.m1();
	}
}
