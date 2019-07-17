package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException 
	{
	 
		Lib Lb=new Lib();
		
		Lb.OpenApp("http://183.82.100.55/ranford2");
		Lb.AdminLgn("Admin","M1ndq");
		
		FileInputStream Fis=new FileInputStream("E:\\MrngOct\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		XSSFSheet WS=WB.getSheet("Rdata");
		
		int Rc=WS.getLastRowNum();
        System.out.println(Rc);
        
        for (int i=1; i<=Rc;i++) 
        {
		  XSSFRow WR=WS.getRow(i);
		  
		  XSSFCell WC=WR.getCell(0);
		  XSSFCell WC1=WR.getCell(1);
		  XSSFCell WC2=WR.getCell(2);
		  
		  XSSFCell WC3=WR.createCell(3);
		  
		  
		  String Rn=WC.getStringCellValue();
		  String Rd=WC1.getStringCellValue();
		  String RT=WC2.getStringCellValue();
		  
		  String Res=Lb.RoleCre(Rn,Rd,RT);
		  WC3.setCellValue(Res);
		  
        }
        
        FileOutputStream Fos=new FileOutputStream("E:\\MrngOct\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
        WB.write(Fos);
        WB.close();
        
        
        
        
		

	}

}
