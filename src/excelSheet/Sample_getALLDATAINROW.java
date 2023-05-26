package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample_getALLDATAINROW 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\ExcelSheet\\book1.xlsx");
	
	Sheet book = WorkbookFactory.create(file).getSheet("Sheet3");
int lastcellindex = book.getRow(0).getLastCellNum()-1;
	
	for(int i=0;i<=lastcellindex; i++) 
	{
		String value = book.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value+"  ");
	}
}
}
