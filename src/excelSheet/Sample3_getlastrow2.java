package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample3_getlastrow2
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("D:\\ExcelSheet\\book1.xlsx");
	
	Workbook book = WorkbookFactory .create(file);
	Sheet sh = book.getSheet("Sheet1");
	int lastrow = sh.getLastRowNum()+1;
	System.out.println(lastrow);
	
}

}
