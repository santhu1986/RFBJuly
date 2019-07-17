package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException 
	{
	
	Lib Lb=new Lib();
		
		Lb.OpenApp("http://183.82.100.55/ranford2");
		Lb.AdminLgn("Admin","Admin");
		
		//To get test data file path
		
		String Fpath="E:\\MrngOct\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
		
		//Results file Path

		String Rpath="E:\\MrngOct\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.txt";
		String SD;
		//To get file
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
	    System.out.println(Sread);
	    
	    //To Write
	    
	    FileWriter FW=new FileWriter(Rpath);
	    BufferedWriter BW=new BufferedWriter(FW);
	    BW.write(Sread);
	    BW.newLine();
	    
	    //Multiple Iterations
	    
	    while ((SD=BR.readLine())!=null) 
	    {
		    System.out.println(SD);
		    
		    //Split
		    
		    String SR[]=SD.split("###");
		    
		    String Rname=SR[0];
		    String Rdes=SR[1];
		    String Rtyp=SR[2];
		    
		    
		   String Res=Lb.RoleCre(Rname,Rdes,Rtyp);
		   BW.write(SD+"%%%%"+Res);
		   // BW.write(Rname+"@@@@"+Rdes+"%%%%%%"+Rtyp+"&&&"+Res);
		    BW.newLine();
		}
	    BW.close();
	    BR.close();
	    
	}

}
