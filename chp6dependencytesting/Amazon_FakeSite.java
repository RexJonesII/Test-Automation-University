package com.testautomationu.chp6dependencytesting;

import org.testng.annotations.Test;

public class Amazon_FakeSite
{
	@Test (groups = "smoke")
	public void test1_LogIn ()
	{
		System.out.println("1. Log In / Group = smoke" + "\n");
	}
	
	@Test (groups = { "smoke", "regression" } )
	public void test2_SearchProducts ()
	{
		System.out.println("2. Search Products / Group = smoke, regression" + "\n");
	}
	
	@Test (groups = { "regression", "integration" , "defect.fix"} )
	public void test3_PlaceOrder ()
	{
		System.out.println("3. Place Order / Group = regression, integration, defect.fix" + "\n");
	}
	
	@Test (groups = { "system", "defect.backlog" } )
	public void test4_SendConfirmation ()
	{
		System.out.println("4. Send Confirmation / Group = system, defect.backlog" + "\n");
	}
	
	@Test (groups = { "regression", "defect.progress" } )
	public void test5_ShipOrder ()
	{
		System.out.println("5. Ship Order / Group = regression, defect.progress" + "\n");
	}
		
	@Test 
	public void test6_LogOut ()
	{
		System.out.println("6. Log Out / Group = None" + "\n");
	}
}
























