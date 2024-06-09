package pack1;

public class ArrayDiscussion
{
	
	public static void main(String[] args)
	{

		System.out.println("GIT Pull Line");
		
		int a  = 10;
		
//		Collection:  to group multiple things
		
		
		// SYNTAX:
		
//		DataType [] arrayName = { data1, data2, data3 ... data_n   };
		
		int [] array1 =  { 10 , 20 , 30 , 40, 70};   
		
		int num1 = array1[0];
		int num2 = array1[1];
		 int num3 = array1[2];
		 int num4 = array1[3];
		
		 System.out.println(num1);
		 System.out.println(num2);
		 System.out.println(array1[3]);
		 
		  int countOfArray = array1.length;
		  System.out.println("countOfArray : " +countOfArray);
		 
		 
//		 DataType [] arrayName = new DataType[size of array];
		 
		 int [] array2 = new int[6];   // N = 6
		 
		 array2[0] = 50;
		 array2[2] = 50;
		 array2[3] = 60;
		 array2[5] = 70; 
		 
//		 System.out.println(array2[0]);
		 System.out.println(array2[0] +" "+array2[1] + " " +  array2[2]);  // default value
		
		 
		 System.out.println("array2 size : " + array2.length);
		 
		
	}

}
