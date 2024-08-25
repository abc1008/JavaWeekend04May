package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ArrayListDiscussion
{
	
	public static void main(String[] args)
	{
		
		
//		dataType [] varName = new dataType[5];
		
//		int [] arr1 = new int[6];
		
//		arr1[4] = 50;
		
		// Arraylist<WrapperClassName> listname = new Arraylist<WrapperClassName>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		ArrayList<Object> list2 = new  ArrayList<Object>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(20);
		
		
		list2.add(20);
		list2.add("abc");
		
		System.out.println(list1);
		
		// get
		System.out.println(list1.get(1));
		// remove
		
		list1.remove(2);
		System.out.println(list1);
		
		list1.add(30);
		System.out.println(list1);
		
		list1.set(2, 30);
		System.out.println(list1);
		
		// size
		System.out.println(list1.size());
		
		
		
		
		
		
		
	}

}
