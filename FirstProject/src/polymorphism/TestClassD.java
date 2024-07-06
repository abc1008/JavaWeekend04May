package polymorphism;

public class TestClassD extends TestClassC
{
//	 public void marry()
//	 {
//		 System.out.println("marry - Child");
//	 }

	 
	public static void main(String[] args)
	{
		TestClassD d = new TestClassD();
		
		d.home();
		d.car();
		d.marry();
	}
	
}
