package collections_Concepts;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Learning {

	public static void main(String[] args) {

		//Hashing is a technique to convert a large String into a small String
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("Student1", "Rucha");
		hm.put("Student2", "Harsh");
		hm.put("Student3", "Sonali");
		
		//If you want to retrieve something, use "get Method"
		
		System.out.println(hm.get("Student1"));
		
		for(Map.Entry<String, String> s: hm.entrySet())
			System.out.println(s.getKey()+" "+s.getValue());
			
		
	}

}
