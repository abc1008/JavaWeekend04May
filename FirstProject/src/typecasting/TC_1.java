package typecasting;

public class TC_1
{
	
	public static void main(String[] args)
	{
		
		byte b = 10;
		System.out.println(b);
		
		 int y = (int)b;
		 
		 
		 // Syntax:    NewVariableDataType variableToStoreConvertedVariable = (NewDataType)variableName;
		 
		 System.out.println(y);
		 System.out.println((int)b);
		 
		 
		 short s = 45;
		 
		 long conv = (long)s;
		 
		 System.out.println(conv);
		 
		 // Explicit TypeCasting
		 
		 int ab = 300; 
		 
		byte ab_conv = (byte)ab;
		System.out.println("Conversion from int to byte : " +ab_conv);
		 
		 
		
	}

}
