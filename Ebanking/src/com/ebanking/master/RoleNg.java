package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNg extends Base
{
	@Test(dataProvider="Rdata")
 public void Rol(String Rn,String Rd,String Rt)
 {
	 Lb.RoleCre(Rn,Rd,Rt);
 }
	@DataProvider
	
	public Object [][] Rdata()
	{
	      Object [][] obj=new Object[3][3];

	      obj[0][0]="Tellerhdfc";
	      obj[0][1]="Teller";
	      obj[0][2]="E";
	      

	      obj[1][0]="Tellerhdfc12";
	      obj[1][1]="Teller";
	      obj[1][2]="E";
	      

	      obj[2][0]="Tellerhdfc24";
	      obj[2][1]="Teller";
	      obj[2][2]="E";
	      
	      return obj;
	}
}
