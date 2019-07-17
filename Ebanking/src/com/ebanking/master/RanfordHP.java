package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class RanfordHP 
{
	//Element Properties
	
	@FindBy (id="txtuId")
	WebElement Uname;
	
	@FindBy (id="txtPword")
	WebElement Pswd;
	
	@FindBy (xpath=".//*[@id='login']")
	WebElement Lgn;
	
	//Element Methods
	
	public void login()
	{
		Uname.sendKeys("Admin");
		Sleeper.sleepTightInSeconds(4);
		Pswd.sendKeys("M1ndq");
		Lgn.click();
	}
	

}
