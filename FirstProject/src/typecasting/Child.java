package typecasting;

public class Child extends Parent
{
	
	public void m1()
	{
		System.out.println("m1 method of child.");
	}
	
	
	public static void main(String[] args)
	{
		Child cc = new Child();
		cc.m1();
		
		Parent conv_cc = (Parent)cc;  //		Parent conv_cc = new Child();    // parent conv_cc = new child();
		conv_cc.m1();  
		
		
		// Downcasting
		System.out.println();
		System.out.println("**** Downcasting ********");
		System.out.println();
		
		
		Parent pp = new Parent();
		pp.m1();    // m1 method of parent.
		
		Child conv_pp = (Child)pp;  		//    Child conv_pp = new Parent();  // Child ref = new Parent();
		conv_pp.m1();
		
		
		
	}
	
}
