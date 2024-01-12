package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		Workbook myWorkbook=WorkbookFactory.create(myFile);
		
		Sheet mySheet=myWorkbook.getSheet("Sheet1");
		int totalNumberOfRows = mySheet.getLastRowNum();
		
		System.out.println(totalNumberOfRows);//output will be 1 number less as persent in file actually...if 3 rows present it will give 2
	
		System.out.println("=========================================================");
		
		short totalNumberOfCells = mySheet.getRow(0).getLastCellNum();
		System.out.println(totalNumberOfCells);
	
	
	}

}
