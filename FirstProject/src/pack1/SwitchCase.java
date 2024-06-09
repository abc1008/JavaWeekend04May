package pack1;

public class SwitchCase
{
	public static void main(String[] args)
	{

//		SYNTAX for Switch Case

//		switch(expression)
//		{
//		case value1 :
//			// statements to execute
//		break;  
//		
//		case value2 :
//			// statements to execute
//		break;  
//		
//		
//		case value3 :
//			// statements to execute
//		break; 
//		
//		default :
//			// statements to execute
//			break; 
//		}

		int monthNumber = 3; // variable declaration + initialization
		String monthName = ""; // variable declaration

		switch (monthNumber)
		{
		case 1:
//			System.out.println("January");
			monthName = "January";
			System.out.println("Case1 second line");
			break;

		case 2:
//			System.out.println("February");
			monthName = "February";
			break;

		case 3:
//			System.out.println("March");
			monthName = "March";
			break;

		case 4:
//			System.out.println("April");
			monthName = "April";
			break;

		case 5:
//			System.out.println("May");
			monthName = "May";
			break;

		case 6:
//			System.out.println("June");
			monthName = "June";
			break;

		case 7:
//			System.out.println("July");
			monthName = "July";
			break;

		case 8:
//			System.out.println("August");
			monthName = "August";
			break;

		case 9:
//			System.out.println("September");
			monthName = "September";
			break;

		case 10:
//			System.out.println("October");
			monthName = "October";
			break;

		case 11:
//			System.out.println("November");
			monthName = "November";
			break;

		case 12:
//			System.out.println("December");
			monthName = "December";
			break;
			
		default :
				System.out.println("Month number is incorrect : " +monthNumber);
				break;

		}
		
		System.out.println("MonthName is : "+ monthName);
		System.out.println("After Switch Case");

	}
}
