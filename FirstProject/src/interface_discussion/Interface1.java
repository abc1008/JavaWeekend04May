package interface_discussion;

public interface Interface1
{
	
	int var1 = 100;   // public, static and final
	
	
	// 100% abstract
	
	
	void m1();   // by default public abstract

	void m2();
	
	public abstract void m3();
	
	int m7();
	
	public static void m8() 
	{
		System.out.println("m8 static method of Interface1");
	}
	
	public static void main(String[] args)
	{
		m8();
		
//		var1 = 200;
		
		System.out.println(var1);   //  by variable name
		
	}

}
