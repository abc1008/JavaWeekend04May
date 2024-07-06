package polymorphism;

public class TestClassC
{
	 final protected int var1 = 800;

	 public void home()
	 {
		 System.out.println("home - Parent");
	 }
	 
	 public void car()
	 {
		 System.out.println("car - Parent");
	 }
	 
	 public final void marry()
	 {
		 System.out.println("marry - Parent");
	 }
	
	public static void main(String[] args)
	{
		TestClassC c1 = new  TestClassC();
		
//		c1.var1 = 900;
		
		System.out.println(c1.var1);
		
	}

}
