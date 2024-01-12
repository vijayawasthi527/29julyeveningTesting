package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelPractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
//		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
//		Workbook myWorkBook = WorkbookFactory.create(myFile);
//	    Sheet mySheet = myWorkBook.getSheet("Sheet1");
//	    String myvalue = mySheet.getRow(0).getCell(1).getStringCellValue();
//	    System.out.println(myvalue);
//	    
//	    String myNewValue = mySheet.getRow(1).getCell(2).getStringCellValue();
//	    System.out.println(myNewValue);
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
				Workbook myWorkBook = WorkbookFactory.create(myFile);
				Sheet mySheet = myWorkBook.getSheet("Sheet2");
				 double value = mySheet.getRow(1).getCell(1).getNumericCellValue();
				System.out.println(value);
	
	}

}
