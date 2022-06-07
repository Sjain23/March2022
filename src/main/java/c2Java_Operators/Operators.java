package c2Java_Operators;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic
		
		int i =10;	//int is a variable and we assign values to variable. it is a box you filling something in it
		int j = 20;
		int k = i+j;
		System.out.println(k);
		System.out.println(i^j);	//why is this giving result 30?
		
		//Assignment Operator:
		// = equal to
		// +=  -=  *=  /=  %=
		
		int a = 1; //can not be int a=b
		int b = a;
		
		//Relational Operator: -> they check relationship between two operands
		//==  !=  >  <  >=  <=
		
		System.out.println(3==5);
		System.out.println(3!=5);
		
		//Logical Operators:
		// && - Logical and
		// || - logical or
		// ! - not
		System.out.println((2>3) || (5>6));
		System.out.println((4>3) || (5>6));
		
		//Unary Operators: -> increment or decrement
		int x = 100;
		x++;	//x--;
		System.out.println(x);
		
		//Bitwise Operators: -> perform certain operation on individual bite
		// ~ - bitwise complement
		// << - bitwise left shift
		// >> - bitwise right shift
		// >>> - bitwise unsigned right shift
		// & - bitwise and
		// ^ - bitwise exclusive or
		
		// what is Java instance of operator
		// Java Ternary Operator
		
		

	}

}
