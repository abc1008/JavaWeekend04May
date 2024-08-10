package encapsulation;

public class Class2
{
	
	public static void main(String[] args)
	{
		Class1 c1 = new Class1();
		double balance = c1.getBalance();
		
		System.out.println(balance);
		
		boolean isBalanceSet = c1.setBalance(6000);
		System.out.println(isBalanceSet);
	}

}
