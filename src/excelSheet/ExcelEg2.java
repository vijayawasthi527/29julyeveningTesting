package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		Row myRow = mySheet.getRow(2);
		
		Cell myCell = myRow.getCell(0);
		
		CellType myDataType = myCell.getCellType();
	
		System.err.println(myDataType);//it will return data type of cell
	}

}
