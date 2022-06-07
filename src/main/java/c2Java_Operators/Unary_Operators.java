package c2Java_Operators;

public class Unary_Operators {

	public static void main(String[] args) {
		
		//increment and decrement operators - post increment, pre increment, pre increment, pre decrement
		
		int i = 1;				//latest value of i is 1
		int j = i++;			//latest value of j is 1, latest value of i will become 2 (j can escape ++increment but i can not)
		int k = j++ + i++;		//k = 1 + 2 = 3, so latest value of j = 2, latest value of i = 3
		int l = ++i + k++ + ++k;	//l = 4 + 3 + 5 = 12, latest value of k = 5
		
		
		
		System.out.println(i);	//4
		System.out.println(j);	//2
		System.out.println(k);	//5
		System.out.println(l); //12
		
		
		//int k = ++i + ++j + j++ + ++j;

	}

}
