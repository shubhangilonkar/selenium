package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2_getlastrowindex 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\ExcelSheet\\book1.xlsx");
	
	 int lastrownum = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
	 System.out.println(lastrownum);
	
	
}
}
