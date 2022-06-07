package c2Java_Operators;

public class Assignment_Inc_Dec_Operators {

	public static void main(String[] args) {
		
		int i = 10;
		int j = i--;
		int k = --i + ++i - --i;
		int l = k++ + --i - ++j - --j;
		int m = --l + --l + i++ - --j + k-- - ++k;
		
		
		/*System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);*/

	}

}
