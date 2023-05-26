package ExcelSheet_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo12_GETCellType2
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("D:\\ExcelSheet\\Excelsheetbook2.xlsx");
	
	CellType cellinfo = WorkbookFactory.create(file).getSheet("Sheet6").getRow(0).getCell(1).getCellType();
	
	System.out.println(cellinfo);
	
	
	
	
}
}
