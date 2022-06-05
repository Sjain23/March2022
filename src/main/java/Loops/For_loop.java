package Loops;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("**************************");
		
		for(int j=20;j>=1;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("**************************");
		
		
		int sum=0;
		for(int k=1;k<=200;k++)
		{
			sum=sum+k;
		}
		System.out.println("The sum of first 200 natural numbers is : "+sum);
	}

}
