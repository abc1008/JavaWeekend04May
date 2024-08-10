package collections;

import java.util.HashSet;

public class HashSetDiscussion
{
	
	public static void main(String[] args)
	{
		
		HashSet<Integer> set1 = new HashSet<>();
		
		HashSet<Object> set2= new HashSet<>();
//	  add
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(60);
		set1.add(40);
		
		set2.add(40);
		set2.add("ABC");
		
		System.out.println(set1);
		
	// remove
	boolean result = set1.remove(20);
	System.out.println(result);
	System.out.println(set1);
	
	// size
	System.out.println(set1.size());
	
	// contains
	boolean isPresent = set1.contains(30);
	System.out.println(isPresent);
	
	// iterate over HashSet
	for( Integer num :set1)
	{
		System.out.print(num + " ");
	}
		
		
	}

}
