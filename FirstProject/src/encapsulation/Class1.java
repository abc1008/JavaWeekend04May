package encapsulation;

public class Class1
{
	
	// 1000.00
	
	private double accBalance = 1000.00;
	
	
	public double getBalance()
	{
		return accBalance;
	}
	
	public boolean setBalance(int balance)
	{
		accBalance = balance;
		
		if(accBalance == balance )
			return true;
		else
			return false;
	}
	
	
	
	
	
	

}
