package pack1;

import access_modifiers.TestClass1;

public class AccessModifier2 extends TestClass1
{
	
	public static void main(String[] args)
	{
		TestClass1 tc1 = new TestClass1();
		AccessModifier2 am = new AccessModifier2();
		
//		System.out.println(tc1.a);
		
//		System.out.println(tc1.c);  // default variable
		
		am.m4();  // calling of protected method using child class ref
		System.out.println(am.a);  // calling of protected variable using child class ref
		
		
	}

}
