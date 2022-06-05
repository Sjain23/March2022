package String_Operations;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[] = {'1','2','3','4','5'};
		
		String s1 = new String(arr);
		System.out.println(s1);
		
		String s3="Annu";
		
		String s2=new String("Sunny");
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(2,4));
		System.out.println(s2.isEmpty());
		
		System.out.println(s3.compareTo(s2));
		
		System.out.println(s2+s3);
		
		System.out.println(s3.length());
		
		
		String s= "Test java string split based on whitespace";	
		String[] splitword=s.split("\\s");
		for(String s4:splitword)
		{
			System.out.println(s4);
		}
		
		
		String s5 = "ABCDE";
		System.out.println(s5.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				continue;		//break;
			}
			System.out.println(i);
		}
		System.out.println();
		
		int i=27;
		int j=5;
		int k=4;
		int l=2;
		
		System.out.println(Math.max(i, j));
		System.out.println(Math.min(i, j));
		System.out.println(Math.sqrt(k));
		System.out.println(Math.cbrt(i));
		System.out.println(Math.pow(k, l));
		
	
	}

}
