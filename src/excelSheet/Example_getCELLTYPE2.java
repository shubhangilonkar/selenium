package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_getCELLTYPE2 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("D:\\ExcelSheet\\book1.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	
	CellType cellinfo = sh.getRow(0).getCell(1).getCellType();
	System.out.println(cellinfo);
			
	
}
}
