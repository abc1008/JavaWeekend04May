package collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapDiscussion
{
	
	public static void main(String[] args)
	{
		
		// student and roll No
		
		HashMap<String, Integer> studentData = new HashMap<String, Integer>();
		
		
		// add the data into hash map
		studentData.put("abc", 1001);
		studentData.put("def", 1002);
		studentData.put("pqr", 1003);
		studentData.put("xyz", 1004);
		
		
		System.out.println(studentData);
		
		
		studentData.put("def", 1005);
		studentData.put(null, 600);
		studentData.put("tyu", 1006);
		studentData.put(null, 1007);
		studentData.put("jkj", null);
		studentData.put("rytt", null);
		
		System.out.println();
		System.out.println(studentData);
		
		
		// fetch the data from map
		
		System.out.println(studentData.get("tyu"));
		System.out.println(studentData.get(null));
		System.out.println(studentData.get("jkj"));
		
		// remove
		
		studentData.remove("jkj");
		System.out.println(studentData);
		
		// keyset
		
		Set<String> allKeys = studentData.keySet();
		System.out.println(allKeys);
		
		
		// iterate over HashMap
		for( String key : allKeys)
		{
			System.out.println(studentData.get(key));
		}
		
	}

}
