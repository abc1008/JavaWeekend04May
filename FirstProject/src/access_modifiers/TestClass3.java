package access_modifiers;

public class TestClass3
{
	public static void main(String[] args)
	{
		
		TestClass1 tc1 = new TestClass1();
		tc1.m2();
		
//		tc1.m3();
		tc1.m4();
		
		System.out.println(tc1.a);
		
//		System.out.println(tc1.b);   // private variable
		
		System.out.println(tc1.c);  // default variable
	}
}
