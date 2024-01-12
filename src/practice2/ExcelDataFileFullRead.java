package practice2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFileFullRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		
		int rows = mySheet.getLastRowNum();
		int totalRows=rows;
		
		short cells = mySheet.getRow(0).getLastCellNum();
		int totalCells=cells-1;
		
		for(int i=0;i<=totalRows-1;i++)
		{
			for(int j=0;j<=totalCells-1;j++)
			{
				CellType cellDataType = mySheet.getRow(i).getCell(j).getCellType();
				
				if(cellDataType==CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
				}
				if(cellDataType==CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+" ");
					
				}
				
				if(cellDataType==CellType.NUMERIC)
				{
					 double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+" ");
				}
			}
			
			System.out.println();
		}
	}

}
