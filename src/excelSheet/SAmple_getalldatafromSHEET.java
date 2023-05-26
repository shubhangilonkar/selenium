package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//abc xyz abc1 xyz1--->row
//xyz
//abc1
//xyz1
public class SAmple_getalldatafromSHEET 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("D:\\ExcelSheet\\book1.xlsx");
	
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
     int lastcellindex = sh.getRow(0).getLastCellNum()-1;
           int lastrowindex = sh.getLastRowNum();
for(int i=0;i<=lastcellindex;i++)    //--->row
{
	for(int j=0;j<=lastrowindex;j++)                            //-->colm
	{
		String value = sh.getRow(j).getCell(j).getStringCellValue();
		System.out.println(value);
	}
	
	System.out.println();
}

}
}
