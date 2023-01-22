package collection;

import java.util.TreeMap;

public class Tree_Map
{
	public static void main(String[] args) {
		
		TreeMap<Integer, String> t = new TreeMap<Integer,String>();
		
		t.put(1, "hi");
		t.put(343, "hello");
		t.put(1, "Hello");
		t.put(234, "dgz");
		t.put(9879, "rty");
		
		
		System.out.println(t);
		
		
	}
	
	
}
