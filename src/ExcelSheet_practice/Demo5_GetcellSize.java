package ExcelSheet_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo5_GetcellSize
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file =new FileInputStream("D:\\ExcelSheet\\Excelsheetbook2.xlsx");
	
	
	short cellSize = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
	System.out.println(cellSize);
}

}
