package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		readmyDataFromExcel(2, 2);

	}
	
	public static String readmyDataFromExcel(int row, int cell) throws
	EncryptedDocumentException, IOException,FileNotFoundException
	{
	FileInputStream myFile= new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");

	Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
	String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	
	return value;
	}

}
