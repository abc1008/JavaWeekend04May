package stringClass;

public class PredefinedMethods
{
	
	public static void main(String[] args)
	{
		
		String s1 = "  Tes,to,me,ter  ";
		
		System.out.println(s1);
		
		System.out.println(s1 + " Institute");
		
		// concat
		
		String s2 = s1.concat(" Institute");
		System.out.println(s2);
		

//		 trim();
		System.out.println(s1.trim());
		
		
//		length();
		
		System.out.println(s1.length());
		
//		
		
		 boolean result = s1.contains("tom");
		 System.out.println(result);
		 
		 
//		 String s1 = "  Tes,to,me,ter  ";
		 
		 String[] arr1 = s1. trim().split(",");
		 
		 for( String s : arr1)
		 {
			 System.out.println(s);
		 }
		 
//		 charAt();
		 String s3 = "Testometer";
		 String s4= " testometer  ";
	 
		System.out.println(s3.charAt(5));
		
		
//		 equals
		
		System.out.println(s3.equals(s4.trim()));
		
//		equalsIgnoreCase()
		
		System.out.println(s3.equalsIgnoreCase(s4.trim()));
		
//		 String s3 = "Testometer";
		
//		replace
		
		System.out.println(s3.replace('m', 'z'));
		
		
//		toUppercase
		
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		
//		 String s3 = "testomeTer";
		
//		indexOf
		
		int index = s3.indexOf('T');
		System.out.println(index);
		
//		lastIndexOf
		
		int lastIndex = s3.lastIndexOf('t');
		System.out.println(lastIndex);
		
	}

}
