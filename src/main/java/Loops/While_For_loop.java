package Loops;

public class While_For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<=5)	//outerloop
		{
			System.out.println("repitition of while loop : "+i);
			
			for(int j=1;j<=5;j++)
			{
				System.out.println("i="+i+":j="+j);
			}
			i++;
		}
	}

}
