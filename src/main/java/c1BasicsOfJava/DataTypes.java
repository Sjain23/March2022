package c1BasicsOfJava;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean b1 = false;
		boolean b2 = true;
		System.out.println(b2);
		System.out.println(b2==b1);
		System.out.println(b2!=b1);
		
		//int datatype:
		int i = 10;
		i = 20;
		
		int j = 30;
		j = 20;
		
		System.out.println("The latest value of i is "+i);
		System.out.println(i*j);
		
		
		int maninder = -2147483648; // this is the extremity of int in the negative x axis
		int sarthak = 2147483647; // is the extremity of int in the positive x axis
		
		//range of int - negative 2^31 to positive 2^31-1
		//default value of int os 0
		System.out.println(maninder + sarthak);
		
		double d =2.3;
		
		char c = '1';
		char c1 = 'a';
		char c2 = '$';
		char c3 = ' ';
	}

}
