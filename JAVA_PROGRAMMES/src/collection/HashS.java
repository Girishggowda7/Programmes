package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashS {
public static void main(String[] args) {
	HashSet<Object> hs = new HashSet<Object>();
	hs.add(7657);
	hs.add("aks");
	hs.add('a');
	hs.add("hi hello");
	
	
	Iterator<Object> in = hs.iterator();
	while(in.hasNext())
	{
		System.out.println(in.next());
	}
	
	
	
}
}
