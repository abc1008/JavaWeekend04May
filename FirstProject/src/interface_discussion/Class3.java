package interface_discussion;

public class Class3 implements Interface1, Interface2
{

	
	
	public void m4()
	{
		System.out.println("m4 body from Class3");
	}

	public void m5()
	{

		System.out.println("m5 body from Class3");
	}


	public void m6()
	{
		System.out.println("m6 body from Class3");
		
	}


	public void m1()
	{
		System.out.println("m1 body from Class3");
		
	}


	public void m2()
	{
		System.out.println("m2 body from Class3");
		
	}

	public void m3()
	{
		System.out.println("m3 body from Class3");
		
	}

	
	public static void main(String[] args)
	{
		Class3 c3 = new Class3();
		c3.m1();
	}

	@Override
	public int m7()
	{
		// TODO Auto-generated method stub
		
		return 8;
	}


}
