package collections_Concepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Learning {

	public static void main(String[] args) {
		
		//Set interface - not ordered
		//duplicates are not allowed
		//It allows null value
		
		Set<String> hs = new HashSet<String>();
		hs.add("Donkey");
		hs.add("Monkey");
		hs.add("Tiger");
		hs.add("Lion");
		hs.add(null);
		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
