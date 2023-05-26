package ExcelSheet_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo14_GetAlldatainRow_withcelltype 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file =new FileInputStream("D:\\ExcelSheet\\Excelsheetbook2.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet7");
	
	int lastRowindex = sh.getLastRowNum();
	for(int i=0;i<=lastRowindex;i++) 
	{
		Cell cellinfo = sh.getRow(i).getCell(0);
	CellType s1 = cellinfo.getCellType();
	
	
	if(s1==CellType.STRING) 
	
	{
		String value = sh.getRow(i).getCell(0).getStringCellValue();
		System.out.print(value+" ");
	}

	if(s1==CellType.NUMERIC) 
	
	{
		double value = sh.getRow(i).getCell(0).getNumericCellValue();
		System.out.print(value+" ");
	}

	if(s1==CellType.BOOLEAN) 
	
	{
		boolean value = sh.getRow(i).getCell(0).getBooleanCellValue();
		System.out.print(value+" ");
	}
	

		
	}
	
	
	
	
	
	
	
	
	
}
}
