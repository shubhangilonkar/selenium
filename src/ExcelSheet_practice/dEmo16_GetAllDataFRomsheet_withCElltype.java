package ExcelSheet_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dEmo16_GetAllDataFRomsheet_withCElltype 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("D:\\\\ExcelSheet\\\\eXcelsheetbook2.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet8");
		
		int lastRowindex = sh.getLastRowNum();
		
		for(int i=0;i<=lastRowindex;i++)
		{
			int lastcellindex = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0;j<=lastcellindex;j++) 
			{
				Cell cellinfo = sh.getRow(i).getCell(j);
				CellType s3 = cellinfo.getCellType();
				
				
			if(s3==CellType.STRING) 
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}	
			if(s3==CellType.NUMERIC) 
			{
				double value = sh.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(value+" ");
			}	
			if(s3==CellType.BOOLEAN) 
			{
				boolean value = sh.getRow(i).getCell(j).getBooleanCellValue();
				System.out.print(value+" ");
			}	
				
			}
			System.out.println();
		}
		
		
	}

}
