package pack1;

public class PrimeNum
{
	// to print prime nums from 1 to 100
	public static void printPrimes()
	{
		for(int i = 1; i<= 100; i++)
		{
			boolean isPrime = isPrime(i);
			
			if(isPrime ==  true)
				System.out.println(i);
		}
	}
	
	public static boolean isPrime(int num)
	{
		int factorCount = 0;
		
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)  // dividing completely
			{
//				System.out.println(i);
				factorCount++;
			}
		}
		if(factorCount == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
//		isPrime(10);
		
		printPrimes();
	}
	
	
	
	

}
