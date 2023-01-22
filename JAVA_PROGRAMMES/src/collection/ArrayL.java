package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayL 
{
	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();
		list.add(8768);
		list.add('G');
		list.add("hi");
		list.add(true);
		list.add(null);
		list.add(80.9889);

		System.out.println("List>>>>>>>>>     "+list);


		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(98);
		list1.add(12);
		list1.add(34);
		list1.add(11);
		list1.add(32);

		Collections.sort(list1);
		System.out.println("List1  sorted>>>>>>>>>     "+list1);

		list.addAll(list1);
		System.out.println("List contain List1>>>>>>>>>>     "+list);
		
		
		if(list.contains("hi"))
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not present");
		}
		
		
		System.out.println(list.indexOf("hi"));
		System.out.println(list.get(0));
		System.out.println(list.remove(0));
		
		
		for (Object obj : list) {
			
			System.out.println(obj);
		}




	}



}
