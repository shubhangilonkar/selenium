package mockpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringdata 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file =new FileInputStream("D:\\ExcelSheet\\Excelsheetbook2.xlsx");
		
//		 String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		
//		 System.out.println(value);
//		 double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
//		System.out.println(value);
//		
		
	boolean value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
		
	System.out.println(value);
	}
	
}
