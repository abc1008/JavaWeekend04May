package abstract_discussion;

public class TestClass2 extends TestClass1
{

	public void logic2()
	{
		System.out.println("logic2 method body");
	}

	public void logic3()
	{
		System.out.println("logic3 method body");
	}
	
	public void logic4()
	{
		System.out.println("logic4 method body");
	}
	
	 public void logic5()
	 {
		 System.out.println("logic5 method body");
	 }

	 
	 public void logic6()
	 {
		 System.out.println("logic5 method body");
	 }
	 
	 public static void main(String[] args)
	{
		 TestClass2 t2 = new TestClass2();  //child class object
		 t2.logic3();
		 t2.logic4();
		 
		 t2.m1();  // complete method inside abstract class
		 
		 TestClass1 ref1 = new TestClass2();  // Ref of Asbtarct class and object of child class
		 ref1.logic4();
		 ref1.m1();
		 
//		 this(); -- to call constructor inside another constructor of same class
//		 super();  -- to call the parent class constr
		 
		 
		 
//		 TestClass1 t1 = new TestClass1();   
		
	}
}
