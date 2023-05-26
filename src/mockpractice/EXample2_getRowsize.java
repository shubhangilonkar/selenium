package mockpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXample2_getRowsize 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("D:\\ExcelSheet\\Excelsheetbook2.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
//	int RowSize = sh.getLastRowNum()+1;
//	
//		System.out.println(RowSize);
		
		short cellSize = sh.getRow(0).getLastCellNum();
		System.out.println(cellSize);
		
	}
}
