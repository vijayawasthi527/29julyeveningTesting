package practiceOfExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetWholeDataFromRowAndColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		//getting whole row data
		
		for(int i=0;i<=3;i++)
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+"  ");
		}
		
		System.out.println();
		System.out.println("==================================================");
		
		//get whole column data
		
		for(int i=0;i<=2;i++)
		{
			String value1 = mySheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value1+"  ");
		}
	
	}

}
