package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");

		Workbook myWorkbook=WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet1");
		
		int lastRowNumber = mySheet.getLastRowNum();
		
		int totalNumberOfRows=lastRowNumber;
		
		short lastCellNumber = mySheet.getRow(0).getLastCellNum();
		
		int totalNumberOfCells=lastCellNumber-1;
		
		//outer For loop ---> Row
		for(int i=0;i<=totalNumberOfRows;i++)
		{
			for(int j=0;j<=totalNumberOfCells;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
	}

}
