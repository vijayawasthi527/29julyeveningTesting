package practiceOfExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetTheSizeOfRowAndColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		int totalNumberOfRows = mySheet.getLastRowNum();
		short totalNumberOfCells = mySheet.getRow(0).getLastCellNum();
		System.out.println(totalNumberOfRows);
		System.out.println(totalNumberOfCells);
	
	
	}

}
