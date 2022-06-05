package Loops;

public class Nested_FroLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for loop inside a for loop
		//inner loop completely executer for one execution of outer loop
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("for repitition of i "+i);
			
			for(int j=1;j<=5;j++)
			{
				System.out.println("i="+i+" :j="+j);
			}
			
		}
	}

}
