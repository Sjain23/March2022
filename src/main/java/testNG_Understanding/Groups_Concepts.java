package testNG_Understanding;

import org.testng.annotations.Test;

public class Groups_Concepts {
	
	@Test(groups = {"smoke"})
	public void tc1()
	{
		System.out.println("Test Case1 Logic");
	}
	
	@Test(groups = {"sanity", "smoke"})
	public void tc2()
	{
		System.out.println("Test Case2 Logic");
	}
	
	@Test(groups = {"regression","sanity", "smoke"})
	public void tc3()
	{
		System.out.println("Test Case3 Logic");
	}
	
	@Test(groups = {"unit","regression","sanity", "smoke"})
	public void tc4()
	{
		System.out.println("Test Case4 Logic");
	}
	
	@Test(groups = {"uat","unit","regression","sanity", "smoke"})
	public void tc5()
	{
		System.out.println("Test Case5 Logic");
	}

}
