package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeFullDataReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		
		int rows = mySheet.getLastRowNum();
		int totalNumOfRows=rows;
		
		short columns=mySheet.getRow(0).getLastCellNum();
		int totalNumberOfCells=columns-1;
		
		for(int i=0;i<=totalNumOfRows-1;i++)
		{
			for(int j=0;j<=totalNumberOfCells-1;j++)
			{
				CellType myCellType = mySheet.getRow(i).getCell(j).getCellType();
				
				if(myCellType==CellType.STRING)
				{
					String value=mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+"  ");
				}
				else if(myCellType==CellType.NUMERIC)
				{
					 double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					 System.out.print(value+"  ");
				}
				else if(myCellType==CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+"  ");
				}
			}
			System.out.println();
		}
	}

}
