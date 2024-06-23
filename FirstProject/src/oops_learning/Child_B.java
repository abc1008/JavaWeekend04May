package oops_learning;

public class Child_B extends Parent_A
{
	
	public Child_B()
	{
		// constructor body
//		super(50, 'u');
		System.out.println("Constructor of Child_B");
	}
	
	public Child_B(int a )
	{
		super(50, 'u');
		System.out.println("1 arg Constructor of Child_B");
	}

	public static void main(String[] args)
	{
		Child_B cb = new Child_B();
		
		
		
	}
	
	
	
}
