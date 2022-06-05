package Loops;

public class Pattern_Programming_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=7;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print("1 ");
			}
		}
		int downstairs = 7;
		for(int k=1;k<downstairs;k++)
		{
			System.out.println();
			for(int l=downstairs;l>k;l--)
			{
				System.out.print("1 ");
			}
		}
	}

}
