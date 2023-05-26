package ExcelSheet2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo5_assinggetALL_datafromSHEET 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("D:\\\\ExcelSheet\\\\book1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet6");
	int lastrowindex = sh.getLastRowNum();
	for(int i=0;i<=lastrowindex;i++) 
	{
		int lastcellindex = sh.getRow(i).getLastCellNum()-1;
		
				for(int j=0;j<=lastcellindex;j++)
				{
					Cell cellinfo = sh.getRow(i).getCell(j);
					CellType s1 = cellinfo.getCellType();
					
				if(s1==CellType.STRING) 
				{
					String value = cellinfo.getStringCellValue();
					System.out.print(value+" ");
				}	
				else if(s1==CellType.NUMERIC) 
				{
					double value = cellinfo.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(s1==CellType.BOOLEAN)
				{
					boolean value = cellinfo.getBooleanCellValue();
					System.out.print(value+" ");
				}	
					
				}
				System.out.println();
	}
	
}
}
