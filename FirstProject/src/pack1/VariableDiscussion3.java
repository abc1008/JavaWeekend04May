package pack1;

public class VariableDiscussion3
{
	int num = 80;
	static int num2 = 70;
	
	public static void main(String[] args)
	{
		VariableDiscussion3 v1 = new VariableDiscussion3();
		System.out.println("Initial value of Non-static varible : " +v1.num);
		v1.num = 90;
		System.out.println("Value changed to 90 using v1");
		System.out.println("Call using v1 object : " + v1.num);
		
		VariableDiscussion3 v2 = new VariableDiscussion3();
		System.out.println("Call using v2 object : " +v2.num);
		
		VariableDiscussion3 v3 = new VariableDiscussion3();
		System.out.println("Call using v3 object : " +v3.num);
		
		System.out.println();
		System.out.println("*********** Static Variable ***********");
		System.out.println();
		
		System.out.println("Initial value of static varible : "+v1.num2);
		v1.num2 = 60;
		System.out.println("Value changed to 60 using v1");
		
		System.out.println("Call using v1 object : "+v1.num2);
		System.out.println("Call using v2 object : "+v2.num2);
		System.out.println("Call using v3 object : "+v3.num2);
	}
	

	

}
