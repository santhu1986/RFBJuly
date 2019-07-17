package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws IOException
	{
	
		Lib Lb=new Lib();
		
		Lb.OpenApp("http://183.82.100.55/ranford2");
	Lb.AdminLgn("Admin","Admin");
	Lb.BranchCre();
	Lb.RoleCre("Tellerdf","Teller","E");
		Lb.admlgt();
		
	}
 
}
