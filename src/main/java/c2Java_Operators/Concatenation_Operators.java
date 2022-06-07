package c2Java_Operators;

public class Concatenation_Operators {

	public static void main(String[] args) {
		
		//concatenation is joining and not adition
		
		int i = 100;
		int j = 200;
		
		System.out.println(i + j);
		
		String s1 = "Mandeep";
		String s2 = "Hardeep";
		
		System.out.println(s1 + s2);
		System.out.println(i + j + s1 + s2);
		System.out.println(s1 + s2 + i + j);
		System.out.println(s1 + s2 + (i + j));

	}

}
