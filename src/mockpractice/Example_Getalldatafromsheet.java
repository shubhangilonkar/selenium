package mockpractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_Getalldatafromsheet 
{public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	
	FileInputStream file =new FileInputStream("D:\\ExcelSheet\\Excelsheetbook2.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
 int lastrowindex = sh.getLastRowNum();
 
 for(int i=0;i<=lastrowindex;i++)        //--->outer loop for row
 {
	int lastcellindex = sh.getRow(0).getLastCellNum()-1;
	 
	 for(int j=0;j<=lastcellindex;j++)         //--->inner loop
	 {
		 String value = sh.getRow(i).getCell(j).getStringCellValue();
		 System.out.print(value+" ");
	 }
	 System.out.println();
 }
 
 
} 

}
