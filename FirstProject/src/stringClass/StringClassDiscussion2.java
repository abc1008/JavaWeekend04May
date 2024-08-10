package stringClass;

public class StringClassDiscussion2
{
	
	
	
	public static void main(String[] args)
	{
		
		// Syntax 1:
		String s1 = "abc";   // string literal
		System.out.println(s1);
		
		

		
		System.out.println(s1.concat(" xyz"));
		
		
		String s2 = s1.concat(" xyz");
		
		
		StringBuffer sb = new StringBuffer("qwe");
	
		System.out.println("StringBuffer : " + sb);
		
		
//		sb.append(" rty");
		
		System.out.println(sb.append(" rty"));
		
		int aa = 897;   // 
		
		
//		 thread-safe or Synchronized
//		not thread-safe	or non-synchronized
		
		
		StringBuilder sbr = new StringBuilder(" iop");
		System.out.println("StringBuilder : " + sbr);
		
		System.out.println(sbr.append(false));
		
		
		
	}
	
	

}
