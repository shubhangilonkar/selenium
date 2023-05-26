package ExcelSheet_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo9_GETAllDataFrom_cell 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\ExcelSheet\\Excelsheetbook2.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	int lastRowindex = sh.getLastRowNum();
	
	for(int i=0;i<=lastRowindex;i++)
	{
		String value = sh.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
	}
}
}
