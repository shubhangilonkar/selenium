package ExcelSheet_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo4_getRowsizeinsheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file =new FileInputStream("D:\\ExcelSheet\\Excelsheetbook2.xlsx");
		
	int rowSize = WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum()+1;
		
		System.out.println(rowSize);
		
		
		
		
		
	}

}
