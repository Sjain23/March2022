package super_Concepts;

public class Child extends Parent{
	
	int i=20;
	
	public void check(int i) 
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);	//this will refer to instance variable of Parent class which is i=10. You have to extend the Parent class here to use OOPS concept);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj=new Child();
		obj.check(30);
	}

}
