package Basicsofselenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Testing {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream File1= new FileInputStream("C:\\Users\\rushi\\eclipse-workspace\\SeleniumBasics\\DDT\\DDTesting.xlsx");
	                     Workbook  W1   =WorkbookFactory.create(File1);
	                            Sheet S1  = W1.getSheet("Login");
	                            Row R1   = S1.getRow(0);
	                            Cell C1 = R1.getCell(0);
	                          String mailid    = C1.getStringCellValue();
	                          System.out.println(mailid);
	                            
	                          Sheet S2  = W1.getSheet("Login");
	                            Row R2   = S2.getRow(0);
	                            Cell C2 = R2.getCell(1);
	                          String pswd    = C2.getStringCellValue();
	                          System.out.println(pswd);
	                          
	                           
	
	
	} 
	

}
