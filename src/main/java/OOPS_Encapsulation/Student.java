package OOPS_Encapsulation;

public class Student {
	
	private String student_name;	//data hide
	private int student_id;			//data hide
	
	public void setData(String name, int id) 
	{
		student_name = name;
		student_id = id;
	}

	public String getData()
	{
		return student_name;
	}
	
	public int getData1()
	{
		return student_id;
	}
}
