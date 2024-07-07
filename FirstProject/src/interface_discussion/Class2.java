package interface_discussion;

public class Class2 extends Class1
{
	public void m3()
	{
		System.out.println("m3 body from Class2");
	}
	
	public static void main(String[] args)
	{
		Class2 c2 = new Class2();  // child ref and child obj
		c2.m1();
		c2.m2();
		c2.m3();
		
		System.out.println(" ********************  ");
		
		Class1 c1 = new Class2();  // parent ref and child obj
		c1.m1();
		c1.m2();
		c1.m3();
		
		System.out.println(" ********************  ");
		
		Interface1 ref1  = new Class2();   // interface ref and child class obj
		ref1.m1();
		ref1.m2();
		ref1.m3();
		
		Interface1.m8();  // static method from Interface
		
		System.out.println(Interface1.var1);    // interfaceName.VariableName
		

		
		
	}

	@Override
	public int m7()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
