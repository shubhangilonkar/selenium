package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("D:\\ExcelSheet\\book1.xlsx");
		
//		
//		Workbook book = WorkbookFactory.create(file);
//		 Sheet sh = book.getSheet("Sheet1");
//		        Row rw = sh.getRow(0);
//		        Cell c = rw.getCell(0);
//		       String value = c.getStringCellValue();
//		       System.out.println(value);
		
	       String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
