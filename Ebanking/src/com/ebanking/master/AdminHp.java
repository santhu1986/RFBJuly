package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHp
{
// EP
	
	@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement Branch;
	
	@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement Role;
	
	@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement Employee;
	
	@FindBy (xpath=".//*[@id='Table_02']/tbody/tr/td[3]/a/img")
     WebElement Logout;
	
	
	//EM
	
	public void Br()
	{
		Branch.click();
	}
	
	public void Rol()
	{
		Role.click();
	}
	public void Emp()
	{
		Employee.click();
	}
	
	public void Lout()
	{
		Logout.click();
	}
	



}
