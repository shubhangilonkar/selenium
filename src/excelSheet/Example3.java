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

public class Example3 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\ExcelSheet\\book1.xlsx");
//	
//	          Workbook book = WorkbookFactory.create(file);
//	        Sheet s1 = book.getSheet("Sheet1");
//	     Row s2 = s1.getRow(0);
//	    Cell s3 = s2.getCell(2);
//	   boolean value = s3.getBooleanCellValue();
//	     
//	   System.out.println(value); 
//	
	boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
	   System.out.println(value);
	
}
}
