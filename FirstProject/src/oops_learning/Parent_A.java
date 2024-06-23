package oops_learning;

public class Parent_A
{
	
	public Parent_A()
	{
		// constructor body
		System.out.println("Constructor of Parent_A");
	}
	
	
	public Parent_A(int a)
	{
		System.out.println("1 argument Constructor of Parent_A");
	}
	
	public Parent_A(int a, char b)
	{
		System.out.println("2 argument Constructor of Parent_A");
	}

	
	public static void main(String[] args)
	{
		
		Parent_A pa = new Parent_A(5,'r');
		
		
		
	}
	
	
}
