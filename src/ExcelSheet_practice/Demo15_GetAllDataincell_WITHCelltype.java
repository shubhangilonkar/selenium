package ExcelSheet_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo15_GetAllDataincell_WITHCelltype 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file =new FileInputStream("D:\\ExcelSheet\\eXcelsheetbook2.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet7");
int lastcellindex = sh.getRow(0).getLastCellNum()-1;

for(int i=0; i<=lastcellindex;i++)
{
	Cell cellinfo = sh.getRow(0).getCell(i);
 CellType s2 = cellinfo.getCellType();

 if(s2==CellType.STRING) 
 {
	 String value = sh.getRow(0).getCell(i).getStringCellValue();
	 System.out.println(value);
 }
 if(s2==CellType.NUMERIC) 
 {
	 double value = sh.getRow(0).getCell(i).getNumericCellValue();
	 System.out.println(value);
 }
 if(s2==CellType.BOOLEAN) 
 {
	 boolean value = sh.getRow(0).getCell(i).getBooleanCellValue();
	 System.out.println(value);
 }
	

}


}
}
