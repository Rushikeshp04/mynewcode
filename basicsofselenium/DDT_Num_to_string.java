package Basicsofselenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_Num_to_string {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 FileInputStream File1 =new FileInputStream("C:\\Users\\rushi\\eclipse-workspace\\SeleniumBasics\\DDT\\DDTesting.xlsx");
		          Workbook  W1 = WorkbookFactory.create(File1);
	               String Mn=  NumberToTextConverter.toText(W1.getSheet(null).getRow(0).getCell(0).getNumericCellValue());
	   System.out.println(Mn);
	
	
	} 

}
