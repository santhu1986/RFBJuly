package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom 
{
    @Test
	public void pom()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
		
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	    RHP.login();
	
	    AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
	    AHP.Br();
	}
}
