package practiceOfExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCompleteDataFromSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		int lastRowNumber = mySheet.getLastRowNum();
		int totalNumOfRows=lastRowNumber;
		
		short lastCellNumber = mySheet.getRow(0).getLastCellNum();
		int totalNumOfCells=lastCellNumber-1;
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
			for(int j=0;j<=totalNumOfCells;j++)
			{
				CellType myCellDataType = mySheet.getRow(i).getCell(j).getCellType();
				
				if(myCellDataType==CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
				}
				else if(myCellDataType==CellType.NUMERIC)
				{
					double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(myCellDataType==CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+" ");
				}
				
				
			}
			System.out.println();
		}
		
	
	}

}
